/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Student;

/**
 *
 * @author Philasande
 */
@Local
public interface StudentFacadeLocal {

    void createStudent(Student student);

    void editStudent(Student student);

    void removeStudent(Student student);

    Student findStudent(Object id);

    List<Student> findAllStudent();

    List<Student> findRangeStudent(int[] range);

    int countStudent();
    
}
