import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentDomen.UserComparator;

public class App {
    public static void main(String[] args) throws Exception {
        // User u1 = new User("Тимофей", "Тимофеев", 25);
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
        /* Создаем 4 группы студентов с номером группы и списком студентов */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        StudentGroup group1 = new StudentGroup(120, listStud1);
        
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        StudentGroup group2 = new StudentGroup(110, listStud2);
       
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s6);
        listStud3.add(s7);
        StudentGroup group3 = new StudentGroup(150, listStud3);
        
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s8);
        listStud4.add(s9);
        listStud4.add(s10);
        StudentGroup group4 = new StudentGroup(130, listStud4);

    //     System.out.println("Список всех студентов:");
    //     for (StudentGroup s : .getAll()) {
    //     System.out.println(s);
    //  }
        // // Collections.sort(group.getStudents());

        // // for(Student stud : group)
        // // {
        // //     System.out.println(stud);
        // // }

        // // System.out.println(u1);
        // // System.out.println(s1); 
        // /* Создаем два потока студентов. В каждом потоке по 2 группы студентов. Поток состоит из номера списка групп */
        // List<StudentGroup> listStream1 = new ArrayList<StudentGroup>();
        // StudentStream studStream1 = new StudentStream(1001, listStream1);
        // listStream1.add(group1);
        // listStream1.add(group3);
        
        // List<StudentGroup> listStream2 = new ArrayList<StudentGroup>();
        // StudentStream studStream2 = new StudentStream(1005, listStream2);
        // listStream2.add(group2);
        // listStream2.add(group4);
       
        
        // Collections.sort(studStream1.getStreams());

        // for(StudentGroup str : studStream1)
        // {
        //     System.out.println(str);
        // }
        // System.out.println(studStream1.getStreams().size());

        // for (StudentGroup sg : studStream1) {
        //     System.out.println(sg);
        // }
        // System.out.println(studStream2);
        
        // /*Сравним двух студентов */
        // UserComparator<Student> compS = new UserComparator<Student>();
        // compS.compare(s9, s10);
      
        
        
        List<Emploee> emploees = new ArrayList<>();
        emploees.add(new Emploee("Борис", "Иванов", 40, "basic"));
        emploees.add(new Emploee("Татьяна", "Новикова", 45, "basic"));
        emploees.add(new Emploee("Раиса", "Рыбкина", 33, "basic"));
        emploees.add(new Emploee("Жорж", "Журов", 30, "basic"));

        Teacher tea1 = new Teacher("Илья", "Орешкин", 42, "Доктор");
        Teacher tea2 = new Teacher("Роман", "Дмитриев", 38, "Доктор");
        Teacher tea3 = new Teacher("Наталья", "Китова", 49, "Кандидат");
        Teacher tea4 = new Teacher("Вера", "Максимова", 35, "Кандидат");
        
        AverageAge<Emploee> emp = new AverageAge<Emploee>(emploees); /*Определяем средний возраст сотрудников */
        System.out.println(emp.average());
        
        // Student s1 = new Student("Сергей", "Иванов", 22, 101);

        // EmploeeController empContr = new EmploeeController();
        // empContr.paySalary(us1);     
        }
    }        
