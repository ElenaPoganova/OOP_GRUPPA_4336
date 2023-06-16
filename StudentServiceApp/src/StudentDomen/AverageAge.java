package StudentDomen;

import java.util.Collection;


public class AverageAge<T extends User> {
    private Collection<T>[] persons;
    
    public AverageAge(Collection<T>[] persons) {
        this.persons = persons;
    }
    
    public double average() {
        double sum = 0.0;

    for(Collection<T> obj : persons){
    
        sum += ((User) obj).getAge();
    }

   
    return (double) sum / persons.length;
    }
     @Override
    public String toString() {
        return "AverageAge []";
    }    

}      
      
    
    


    
