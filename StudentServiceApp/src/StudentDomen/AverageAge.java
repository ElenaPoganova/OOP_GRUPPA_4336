package StudentDomen;


import java.util.List;


public class AverageAge<T extends User> {
    private List<T> persons;
    
    public AverageAge(List<T> persons) {
        this.persons = persons;
    }
    
    public double average() {
        double sum = 0.0;

    for(T obj : persons){
    
        sum += ((User) obj).getAge();
    }

   
    return (double) sum / persons.size();
    }
     @Override
    public String toString() {
        return "AverageAge []";
    }    

}      
      
    
    


    
