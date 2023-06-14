package StudentDomen;

import java.util.Iterator;
import java.util.List;
/*Имплементируем  Iterable, Comparable для возможности сортировки и вывода в консоль*/
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private int numberGroup;
    private List<Student> students;
/*Поля в классе - номер группы и список студентов */
    public StudentGroup(int numberGroup, List<Student> students) {
        this.students = students;
        this.numberGroup = numberGroup;
    }
/* Создали конструктор */
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int getGroupSize()
    {
        return this.students.size();
    }   
/*Переопределили метод для вывода в консоль номера группы и количества студентов в группе  */
    @Override
    public String toString() {
    System.out.printf("Номер группы %d", getNumberGroup());
            for (Student stud : students) {
                System.out.println(stud);
            }
            return String.format("Колличество студентов: %d\n", students.size());
        }
  
  
    @Override
    public Iterator<Student> iterator() {
       return new StudentGroupIterator(students);
    }
/* Переоределим метод сортировки по номеру группы */
 
    @Override
    public int compareTo(StudentGroup o) {
    if(this.getNumberGroup()==o.getNumberGroup())
        {
            return 0;
        } 
        if(this.getNumberGroup() < o.getNumberGroup())
        {
            return -1;
        }
        return 1;
    }
}
    // @Override
    // public int compareTo(StudentGroup o) {
    // if(this.getGroupSize()==o.getGroupSize())
    //     {
    //         return 0;
    //     } 
    //     if(this.getGroupSize() < o.getGroupSize())
    //     {
    //         return -1;
    //     }
    //     return 1;
    // }
    
  


    //  @Override
    // public Iterator<Student> iterator() {
    //    return new Iterator<Student>(){
    //     private int index = 0; 
    //      @Override
    // public boolean hasNext() {
    //    return index < students.size();
    // }

    // @Override
    // public Student next() {
    //     if(!hasNext())
    //     {
    //         return null;
    //     }
       
    //     return students.get(index++);
    // }
    // };
   

