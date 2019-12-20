
           <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
     <div class="row text-center">
            <strong>EditEmployeeDetails</strong>
        </div>
        <div class="row" style="border: 1px solid green; padding: 10px">
           
              
           <form:form method="post" action="editsave">   
            <table >    
             <tr>    
              <td>FirstName : </td>   
              <td><form:input path="firstName"  />
              <form:errors path="firstName" style="color:red"/></td>  
             </tr>    
             <tr>    
              <td>LastName :</td>    
              <td><form:input path="lastName" /><form:errors path="lastName" style="color:red"/></td>  
             </tr>  <tr>    
              <td>MiddleName :</td>    
              <td><form:input path="middleName" /></td>  
             </tr> 
             <tr>    
              <td>Date Of joining :</td>    
              <td><form:input path="doj" /><form:errors path="doj"/></td>  
             </tr>  
               
              <tr>
              <td>Employee Type:</td>      
              <td><form:select path="employeeType">  
        <form:option value="permanent" label="permanent"/>  
        <form:option value="temporary" label="temporary"/>  
        </form:select>
        </td>  
             </tr>    
             
               
              <tr>
              <td>Designation:</td>      
              <td><form:input path="designation"  /><form:errors path="designation" style="color:red"/></td>  
             </tr>    
              
             <tr>    
              <td>MobileNumber :</td>    
              <td><form:input path="mobileNumber" /><form:errors path="mobileNumber" /></td>  
             </tr>   
              
             
             <tr> 
              <td> </td>    
              <td><input type="submit" value="editsave" /></td>    
             </tr>    
            </table>    
           </form:form> </div>   

