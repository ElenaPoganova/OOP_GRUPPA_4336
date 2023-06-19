package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents(); /* Извлечение списка всех студентов*/

    /* Удаление студента по указанному id*/
    public Integer deleteStudentById(Long id);
    
}
  