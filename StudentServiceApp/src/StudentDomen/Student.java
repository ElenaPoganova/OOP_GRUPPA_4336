package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long studentId;

    public Student(String firstName, String secondName, int age, long studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
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
    public int compareTo(Student o) {
        if(this.getStudentId()==o.getStudentId())
        {
            return 0;
        } 
        if(this.getStudentId() < o.getStudentId())
        {
            return -1;
        }
        return 1;
    }

}
