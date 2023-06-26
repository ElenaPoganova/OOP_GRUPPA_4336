    // 1) Переписать код в соответствии с Single Responsibility Principle:
    //Подсказка: вынесите метод calculateNetSalary() в отдельный класс

import java.util.Date;
/* Сотрудник и его данные */

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    /* Возвращает информацию о сотруднике*/
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    
}