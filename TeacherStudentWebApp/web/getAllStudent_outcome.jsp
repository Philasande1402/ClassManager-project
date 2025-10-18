<%-- 
    Document   : getAllStudent_outcome
    Created on : 13 May 2025, 2:01:10 PM
    Author     : Philasande
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get all student Page</title>
    </head>
    <body>
        <h1>Get all student outcome.</h1>
        <%
            List<Student> list = (List<Student>) request.getAttribute("list");
        %>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Student number</th>
        </tr>
            <%
                for(int i=0;i<list.size();i++){
                Student s = list.get(i);
                String name = s.getName();
                Integer age = s.getAge();
                Long id = s.getId();
                %>
        <tr>
            <td><%=name%></td>
            <td><%=age%></td>
            <td><%=id%></td>
        </tr>
        <%
            }
%>
        
    </table>

<p>
    Click <a href="menu.html">here</a> to go back to the menu page. <br>
    Click <a href="LogoutServlet.do">here</a> to logout.
</p>
    </body>
</html>
