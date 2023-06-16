package Controllers;

import StudentDomen.Student;
import StudentService.StudService;

public class StudentController implements iUserController<Student> {
    private final StudService dataService = new StudService();

    @Override
    public void create(String firstName, String secondName, int age) {
      dataService.create(firstName, secondName, age);
    }

}