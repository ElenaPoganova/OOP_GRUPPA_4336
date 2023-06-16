package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

public class EmploeeController implements iUserController<Emploee>{
    private final EmploeeService empServ = new EmploeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
        empServ.create(firstName, secondName, age);
    }

    public <T extends User> void paySalary(T user)
    {
        System.out.println((user).getFirstName() + " выплачена зарплата 10000р.");
    }    
}
