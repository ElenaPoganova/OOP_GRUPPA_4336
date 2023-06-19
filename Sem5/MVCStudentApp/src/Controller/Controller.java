package Controller;
import Model.Student;
import Model.Model;
import View.View;
import java.util.ArrayList;
import java.util.List;
import View.ViewEng;
import Model.HachModel;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;
    
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    /*Метод получения всех студентов */
    public void getAllStudents()
    {
        students = model.getAllStudents();
    }
    /* Метод проверки данных */
    public boolean testData(){
        if(students.size() > 0){
            return true;
        } else {
            return false;
        }    
        }
    
    public void update()
    {  /*MVP */
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");

        }
        // MVC
        // // view.printAllStudents(model.getAllStudents());
    }

     public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                        Long id = view.getStudentIdToDelete();
                        long result = model.deleteStudentById(id);
                        if (result == 1) {
                            System.out.println("Студент успешно удален!");
                        } else if (result == -1) {
                            System.out.println("Студент с указанным идентификатором не найден!");
                        }
                        break;
            }       

        }
    }
}
