/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author Philasande
 */
public class AddStudentServlet extends HttpServlet {

@EJB
    private StudentFacadeLocal sfl;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("name");
         Integer age = Integer.parseInt(request.getParameter("age"));
         Long id = Long.parseLong(request.getParameter("id"));
         
         Student stu = createStudent(name,age,id);
         sfl.createStudent(stu);
         
         request.getRequestDispatcher("addStudent_outcome.jsp").forward(request, response);
         
    }

    private Student createStudent(String name, Integer age, Long id) {
        Student s = new Student();
        
        s.setId(id);
        s.setAge(age);
        s.setName(name);
        s.setCreationDate(new Date());
        return s;
    }

  
}
