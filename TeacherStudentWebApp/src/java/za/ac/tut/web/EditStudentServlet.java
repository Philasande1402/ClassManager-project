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
public class EditStudentServlet extends HttpServlet {
 @EJB
    private StudentFacadeLocal sfl;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Long id = Long.parseLong(request.getParameter("id"));
       Integer age = Integer.parseInt(request.getParameter("age"));
       String location = "editStudent_outcome.jsp";
       
       Student st = sfl.findStudent(id);
       
       if(st == null){
           
           location ="studentnotfound.jsp";
       }else {
           Student stude = modifyStudent(st,age);
           sfl.editStudent(stude);
       }
       
       request.getRequestDispatcher("editStudent_outcome.jsp").forward(request, response);
    }

    private Student modifyStudent(Student st, Integer age) {
        st.setAge(age);
        return st;
    }

}
