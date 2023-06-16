package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    
    public TeacherService(List<Teacher> teachers) {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
       return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher us = new Teacher(firstName, secondName, age, "DoctorOfSciences");
        teachers.add(us);
    }

    public List<Teacher> getSortedByFIOTeacherList()
    {
        List<Teacher> newTeachList = new ArrayList<Teacher>(teachers);
        newTeachList.sort(new UserComparator<Teacher>());
        return newTeachList;
    }
}
   

   