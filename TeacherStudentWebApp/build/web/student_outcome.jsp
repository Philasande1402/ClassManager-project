<%-- 
    Document   : student_outcome
    Created on : 13 May 2025, 1:52:40 PM
    Author     : Philasande
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find student Page</title>
    </head>
    <body>
        <h1>Find student outcome</h1>
        
        <%
            Student st = (Student) request.getAttribute("st");
            String name = st.getName();
            Integer age = st.getAge();
            Long id =st.getId();
            
        %>
        <p>
            The student has been found. Below are the details of the student.
        </p>
        
        <table>
            <tr>
                <td><b>Name  </b>:</td>
                <td><%=name%></td>
            </tr>
            
            <tr>
                <td><b>Age  </b>:</td>
                <td><%=age%></td>
            </tr>
            
            <tr>
                <td><b>Student number  </b>:</td>
                <td><%=id%></td>
            </tr>
        </table>
            <p>
                Click <a href="menu.html">here</a> to go back to menu page.<br>
                Click <a href="LogoutServlet.do">here</a> to logout.
            </p>
    </body>
</html>
