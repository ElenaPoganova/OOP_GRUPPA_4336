package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;
import StudentDomen.User;

public class TeacherController implements iUserController<Teacher>{
    private final TeacherService teachServ = new TeacherService(null);
    
    @Override
    public void create(String firstName, String secondName, int age) {
        teachServ.create(firstName, secondName, age);
    }
   
}



 