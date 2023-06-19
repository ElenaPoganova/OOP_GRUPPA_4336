package Model;

public class Student extends User implements Comparable<Student>{
    private long studentId;
    private Integer long1;

    public Student(String firstName, String secondName, Integer age, Integer studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public Student(String firstName, String secondName, int age, Integer long1) {
        this.long1 = long1;
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

    public Long getStudentID() {
        return null;
    }

}
