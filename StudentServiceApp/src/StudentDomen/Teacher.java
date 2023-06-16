package StudentDomen;

public class Teacher extends User {
    private String acadDegree;
     
   
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
     public String getAcadDegree() {
        return acadDegree;   
    }
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "Teacher {" 
        + "firstName =" + super.getFirstName()
        +", secondName=" + super.getSecondName()
        +", age=" + super.getAge() 
        +", acadDegree=" + acadDegree + 
        "}";
    }
    @Override
    public int getAge() {
       return super.getAge();
    }

}