/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
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
public class RemoveStudentServlet extends HttpServlet {

   @EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        
        Student st = createStudent(id);
        sfl.removeStudent(st);
        
        request.getRequestDispatcher("removeStudent_outcome.jsp").forward(request, response);
    }

    private Student createStudent(Long id) {
        Student s = sfl.findStudent(id);
        s.setId(id);
        
        return s;
    }

}
