package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if ( name == null || name.isEmpty() || name.length() > 40 ) {
            throw new IllegalArgumentException("Problem with name!");
        }
        
        if ( age < 0 || age > 120) {
            throw new IllegalArgumentException("Problem with age!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return this.name + " age: " + this.age;
    }
}
