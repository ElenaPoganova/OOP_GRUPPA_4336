

import java.util.Iterator;
import java.util.List;
/*Имплементируем  Iterable, Comparable для возможности сортировки и вывода в консоль*/
public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>>{
    private V numberGroup;
    private List<Student<T,V>> students;
/*Поля в классе - номер группы и список студентов */
    public StudentGroup(List<Student<T,V>> students, V numberGroup) {
        this.students = students;
        this.numberGroup = numberGroup;
    }
/* Создали конструктор */
    public List<Student<T,V>> getStudents() {
        return students;
    }

    public void setStudents(List<Student<T,V>> students) {
        this.students = students;
    }
    public V getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(V numberGroup) {
        this.numberGroup = numberGroup;
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
    public Iterator<Student<T,V>> iterator() {
       return new Iterator<Student<T,V>>();
        {
            private int counter;
        
  
            @Override
            public boolean hasNext() {
            return counter < students.size();
            }

            @Override
            public Student<T,V> next() {
                if(!hasNext())
                {
                    return null;
                }
            
                return students.get(counter++);
            }
        }
    }
    public List getGroup() {
        return null;
    }  
}                  
/* Переоределим метод сортировки по номеру группы */

 
    // @Override
    // public int compareTo(StudentGroup o) {
    // if(this.getNumberGroup()==o.getNumberGroup())
    //     {
    //         return 0;
    //     } 
    //     if(this.getNumberGroup() < o.getNumberGroup())
    //     {
    //         return -1;
    //     }
    //     return 1;
    // }

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
   

