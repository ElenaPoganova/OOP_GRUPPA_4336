package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/*Класс ViewEng представляет данные на английском языке и реализует интерфейс iGetView */
public class ViewEng implements iGetView { 
    private Scanner scanner;

    public ViewEng() {
        scanner = new Scanner(System.in);
    }
    
    public void printAllStudents(List<Student> students)
    {
        System.out.println("-----Student List-------");
        for(Student stud : students)
        {
            System.out.println(stud);
        }
        System.out.println("-----End of List-----");
    }

    @Override
    public String prompt(String message) {
             Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete() {
        System.out.print("Enter the ID of the student to delete: ");
        return scanner.nextLong();
    }
    
}
