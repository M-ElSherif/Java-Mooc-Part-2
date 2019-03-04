import java.util.*;
import validation.*;

public class Main {
    public static void main(String[] args) {
        
        // Test for the person class
        Person person = new Person("abood", 23);
        System.out.println(person);
        person = new Person("asdd" , 120);
        System.out.println(person);
    
        // Test the Calculator class
        Calculator calculator = new Calculator();
        
        calculator.multiplication(1);
        calculator.binomialCoefficient(2, 4);
        
        
    }
    
    
}
