package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }
    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public Integer deleteStudentById(Long id) {
          int i = -1;
        for (Student pers : students) {
            if (pers.getStudentID() == id) {
                i = students.indexOf(pers);
            }
        }
        students.remove(i);
        return i;
    }        /*Удаляет студента по id. (-1, если студент не найден) */
     
       
    
}
