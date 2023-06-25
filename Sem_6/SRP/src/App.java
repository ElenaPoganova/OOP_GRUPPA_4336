package OOP_GRUPPA_4336.Sem_6.SRP.src;
public class App {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Ольга_Петрова", "12.11.1991", 100000);
        SalaryCalculator salaryCalc = new SalaryCalculator();
        System.out.println(employee.getEmpInfo());
        System.out.println("NetSalary: " + salaryCalc.calculateNetSalary(employee));
                       
        }
}
