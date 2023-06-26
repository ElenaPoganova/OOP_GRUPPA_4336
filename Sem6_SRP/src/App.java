import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
      Employee employee = new Employee("Ольга_Петрова",
                new Date(1991, Calendar.NOVEMBER, 10),
                100000);
        SalaryCalculator salaryCalc = new SalaryCalculator();
        System.out.println(employee.getEmpInfo());
        System.out.println("NetSalary: " + salaryCalc.calculateNetSalary(employee));
                       
        }
}
