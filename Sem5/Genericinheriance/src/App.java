import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
   



    public static void main(String[] args, char[] stud) throws Exception {
      Student<String, Integer> s1 = new Student<String, Integer>("Павел", "Романов", 27, 01);
      System.out.println(s1);  
      Student<String, Integer> s2 = new Student<String, Integer>("Петр", "Романенко", 35, 01);
      Student<String, Integer> s3 = new Student<String, Integer>("Илья",  "Родин", 23, 01);
    
      List<Student<String, Integer>> listStud = new ArrayList<>();
      listStud.add(s1);
      listStud.add(s2);
      listStud.add(s3);
      StudentGroup<String,Integer> group = new StudentGroup<String, Integer>(listStud, 130);
      for(Student<String,Integer> stud : group);
    {
        System.out.println(stud);
    }    
    Collections.sort(group.getGroup());
    }
}
