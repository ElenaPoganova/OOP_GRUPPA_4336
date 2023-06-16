package StudentService;

import java.util.List;
import java.util.ArrayList;


import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.UserComparator;

public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees;
    
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee us = new Emploee(firstName, secondName, age, "basic");
        emploees.add(us);
    }
  public List<Emploee> getSortedByFIOEmploeeStudentsList()
    {
        List<Emploee> newEmploiList = new ArrayList<Emploee>(emploees);
        newEmploiList.sort(new UserComparator<Emploee>());
        return newEmploiList;
    }

public int getCount() {
    return count;
}

public List<Emploee> getEmploees() {
    return emploees;
}
    
}