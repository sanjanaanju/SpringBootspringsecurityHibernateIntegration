<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head><body >
<div class="row text-center">
            <strong>EditEmployeeDetails</strong>
        </div>
        <div class="row" style="border: 1px solid green; padding: 10px">
            
<table border="2" width="100%" cellpadding="2" bgcolor="LightGreen">  
<tr><th>Id</th><th>FName</th><th>LName</th><th>MName</th><th>DOJ</th>
<th>Designation</th><th>MobileNumber</th><th>EmployeeType</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.firstName}</td>  
   <td>${emp.lastName}</td>  
   <td>${emp.middleName}</td>  
   <td>${emp.doj}</td>  
   
   <td>${emp.designation}</td> 
   <td>${emp.mobileNumber}</td>
    <td>${emp.employeeType}</td>  
     <td><a href="editemp/${emp.id}">Edit</a></td> 
     <td><a href="deleteemp/${emp.id}">Delete</a></td>  
    
  
   </tr>  
   </c:forEach>  
   </table>  
</div>
</body>
</html>