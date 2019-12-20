package com.developerstack.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;


import com.developerstack.model.Employee;
import com.developerstack.service.EmployeeService;
import com.developerstack.service.UserService;
@ComponentScan("com.developerstack.service") 
@Controller
public class DashboardController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private EmployeeService empService;


    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", userService.getUsers());
    	model.setViewName("dashboard");
    	return model;
    }
    @RequestMapping("/employee")    
    public String bookingForm(Model model)  
    {  
          //create a reservation object   
        	Employee res=new Employee();  
          //provide reservation object to the model   
        model.addAttribute("employee", res);  
        return "employee";  
    }
    @RequestMapping("/submitForm")  
    // @ModelAttribute binds form data to the object  
    public String submitForm( @Valid @ModelAttribute("employee") Employee res, BindingResult br)  
    {  
        
    	 if(br.hasErrors())  
         {  
             return "employee";  
         }  
    	 else 
    		 {
    		 return "AccountCreated";  
    		 }
    }  
    @RequestMapping(value="/user",method = RequestMethod.GET)    
    public ModelAndView showform2(){     
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", userService.getUsers());
    	model.setViewName("user");
    	return model; 
    }
    
     
   @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("employee") Employee emp1){    
    	empService.createEmployee(emp1);    
        return "redirect:/viewemp";//will redirect to viewemp request mapping    
    }
   @RequestMapping(value="/viewemp",method = RequestMethod.GET,headers="Accept=application/json")    
   public String viewemp(Model m){    
       List<Employee> list=empService.getEmployee();   
       m.addAttribute("list",list);  
       return "viewemp";    
   }    
  
   @RequestMapping(value="/editemp/{id}")    
   public String edit(@PathVariable int id, Model m){    
       Employee emp=empService.findById(id) ;  
       m.addAttribute("command",emp); 
       System.out.println("---------------------------------");
       empService.update(emp, id); 
       List<Employee> list=empService.getEmployee();    
       m.addAttribute("list",list); 
       System.out.println("---------------------------------");

            return "editform";    
   }    
   /* It updates model object. */    
   @RequestMapping(value="/editemp/editsave",method = RequestMethod.POST)    
   public String editsave(@ModelAttribute("emp") Employee emp,Model m){    
      // dao.update(emp);    
       List<Employee> list=empService.getEmployee();    
       m.addAttribute("list",list);  
       return "redirect:/viewemp";      
   }  
      
   @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
   public String delete(@PathVariable int id){    
       empService.deleteEmployeeById(id);    
       return "redirect:/viewemp";    
   }
   @RequestMapping(value="/get", headers="Accept=application/json")
	 public List<Employee> getAllUser() {	 
	  List<Employee> tasks=empService.getEmployee();
	  return tasks;
	
	 }

   }
