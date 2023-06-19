

public class Student<T extends Comparable<T>,V> extends User<T,V> implements Comparable<Student<T,V>>{
    private V studentId;

    public Student(T firstName, T secondName, V age, V studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public V getStudentId() {
        return studentId;
    }

    public void setStudentId(V studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
        "studentId=" + studentId
        +", firstName=" + super.getFirstName()
        +", secondName=" + super.getSecondName()
        +", age=" + super.getAge() +
        "}";
    }

    @Override
    public int compareTo(Student<T,V> o) {
        return super.firstName.compareTo(o.firstName);
    }

}
