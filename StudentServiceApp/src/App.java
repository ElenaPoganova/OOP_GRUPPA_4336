import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Тимофей", "Тимофеев", 25);
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

        // Collections.sort(group.getStudents());

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println(u1);
        // System.out.println(s1); 
        /* Создаем два потока студентов. В каждом потоке по 2 группы студентов. Поток состоит из номера списка групп */
        List<StudentGroup> listStream1 = new ArrayList<StudentGroup>();
        StudentStream studStream1 = new StudentStream(1001, listStream1);
        listStream1.add(group1);
        listStream1.add(group3);
        
        List<StudentGroup> listStream2 = new ArrayList<StudentGroup>();
        StudentStream studStream2 = new StudentStream(1005, listStream2);
        listStream2.add(group2);
        listStream2.add(group4);
       
        
        // for(StudentGroup strGr : Streams)
        // {
        //     System.out.println(strGr);
        // }

       
        Collections.sort(studStream1);

        for(StudentGroup str : StudentStream)
        {
            System.out.println(str);
        }

        for (StudentStream ss : StudStream2){
            System.out.println(ss.getStreams().size());
            for (StudentGroup sg : ss) {
                System.out.println(sg);
            }
        }

            // }    
        System.out.println(studStream2);
    

}
}