<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>View Customer Details</h2>
   
   <c:if test="${cust!=null }">
   
      <table border="1" style="width:50%">
           
            <tr>
               <td>Custid </td>
               <td>${cust.id }</td>
           </tr>
            <tr>
               <td>Name </td>
               <td>${cust.name }</td>
           </tr>
            <tr>
               <td>Age </td>
               <td>${cust.age }</td>
           </tr>
            <tr>
               <td>TelNum </td>
               <td>${cust.telnum }</td>
           </tr>
            <tr>
               <td>Email </td>
               <td>${cust.email }</td>
           </tr>
      
      
      
      </table>
   
   </c:if>

</body>
</html>