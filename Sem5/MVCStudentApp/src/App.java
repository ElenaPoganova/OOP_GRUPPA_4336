import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.HachModel;
import Model.Model;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // List<Student> students = new ArrayList<Student>();
        // Student s1 = new Student("Никита", "Никитин", 23, 101);
        // Student s2 = new Student("Вероника", "Вероникина", 20, 102);
        // Student s3 = new Student("Елена", "Ленина",27 , 103);
        // Student s4 = new Student("Том", "Боббс", 35, 104);
        // Student s5 = new Student("Сергей", "Сергеев", 29, 105);
        // Student s6 = new Student("Клаус", "Котов", 18, 106);
        // Student s7 = new Student("Роман", "Сладков", 24, 107);
        // Student s8 = new Student("Евгений", "Жук",37 , 108);
        // Student s9 = new Student("Томара", "Бобкова", 25, 109);
        // Student s10 = new Student("Ксения", "Сергеева", 19, 110);
               
        // students.add(s1);
        // students.add(s2);
        // students.add(s3);
        // students.add(s4);
        // students.add(s5);
        // students.add(s6);
        // students.add(s7);
        // students.add(s8);
        // students.add(s9);
        // students.add(s10);

        Student s1 = new Student("Никита", "Никитин", 23, 101);
        Student s2 = new Student("Вероника", "Вероникина", 20, 102);
        Student s3 = new Student("Елена", "Ленина",27 , 103);
        Student s4 = new Student("Том", "Боббс", 35, 104);
        Student s5 = new Student("Сергей", "Сергеев", 29, 105);
        Student s6 = new Student("Клаус", "Котов", 18, 106);
        Student s7 = new Student("Роман", "Сладков", 24, 107);
        Student s8 = new Student("Евгений", "Жук",37 , 108);
        Student s9 = new Student("Томара", "Бобкова", 25, 109);
        Student s10 = new Student("Ксения", "Сергеева", 19, 110);

        HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
        
        hashStudents.put((long) 101, s1);
        hashStudents.put((long) 102, s2);
        hashStudents.put((long) 103, s3);
        hashStudents.put((long) 104, s4);
        hashStudents.put((long) 105, s5);
        hashStudents.put((long) 106, s6);
        hashStudents.put((long) 107, s7);
        hashStudents.put((long) 108, s8);
        hashStudents.put((long) 109, s9);
        hashStudents.put((long) 110, s10);
        

        FileModel fModel = new FileModel("StudentsDB.txt");
        // fModel.saveAllStudentToFile(students);

        // iGetModel model = new Model(students);
        // iGetModel newFModel = fModel;
        iGetView view = new View();

        
        iGetModel model = new HachModel(hashStudents);

        Controller controller = new Controller(view, model);
        // controller.update();
        controller.run();
    }
}
