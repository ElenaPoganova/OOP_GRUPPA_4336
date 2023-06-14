package StudentDomen;


import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private int numberStream;
    private List<StudentGroup> streams;
    /*Поля в классе - номер потока и список групп студентов */
    public StudentStream(int numberStream, List<StudentGroup> streams) {
        this.streams = streams;
        this.numberStream = numberStream;
    }
/*конструктор */
    public List<StudentGroup> getStreams() {
        return streams;
    }

    public void setStream(List<StudentGroup> streams) {
        this.streams = streams;
    }

    public int getNumberStream() {
        return numberStream;
    }

    public void setNumberStream(int numberStream) {
        this.numberStream = numberStream;
    }

    public void addStreams(StudentGroup strGr){
        this.streams.add(strGr);
    }
/*переопредилили итератор для методов hasNext и next */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(streams);
    }

   /*Переопределили метод для вывода в консоль номера потока и количества групп в потоке  */ 
    @Override
    public String toString() {
    System.out.printf("Номер потока %d", getNumberStream());
            for (StudentGroup studGr : streams) {
                System.out.println(studGr);
            }
            return String.format("Колличество групп: %d\n", streams.size());
        }
  
    
}

   

        


