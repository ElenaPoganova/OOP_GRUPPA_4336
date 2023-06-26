package OOP_GRUPPA_4336.Sem_6.SRP.src;
/* Класс по рассчету зарплаты */
class SalaryCalculator {
    private double taxRate = 0.25;
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * taxRate); //calculate in otherway
        return employee.getBaseSalary() - tax;
    }
/* Вычисление чистой заработной платы на основе базовой заработной платы с учетом вычета налога
 */
   
    
}

