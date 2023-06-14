package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> streams;

    public StudentStreamIterator(List<StudentGroup> streams) {
        this.counter = 0;
        this.streams = streams;
    }
/*Переопределим метод hasNext, который проверяет границы списка streams в данном случае*/
    @Override
    public boolean hasNext() {
       return counter < streams.size();
    }
/*Переопределим метод next для вывода streams с проверкой */
    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        return streams.get(counter++);
    }
}
