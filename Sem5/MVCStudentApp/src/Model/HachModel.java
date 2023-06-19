package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Controller.iGetModel;

public class HachModel implements iGetModel  {
    
    private HashMap<Long, Student> students;
   
     /* Конструктор класса ModelHash. Список студентов в виде хэш-таблицы */
        public HachModel(HashMap<Long, Student> students) {
        this.students = students;
    }
        /* Возвращает список всех студентов. */
    public List<Student> getAllStudents() {
    List<Student> studList = new ArrayList<Student>();

    for (var stud : students.entrySet())
        studList.add(stud.getValue());

    return studList;
    }
    @Override
    public Integer deleteStudentById(Long id) {
    if (students.containsKey(id)) {
            students.remove(id);
            return 1;
        }
        return -1;
    }
}

 