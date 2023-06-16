package StudentService;

import java.util.List;
import java.util.ArrayList;
import StudentDomen.Student;
import StudentDomen.UserComparator;

public class StudService implements iUserService<Student>{
    private int count;
    private List<Student> students;

    public StudService() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student us = new Student(firstName, secondName, age, count);
        count++;
        students.add(us);
    }

    public List<Student> getSortedByFIOStudentsList()
    {
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new UserComparator<Student>());
        return newStudList;

    }
}
