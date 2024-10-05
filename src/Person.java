import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int testForRefection(int age){
        return age++;
    }

    @Override
    public int hashCode() {
        int hash =  Objects.hash(name, age); // Combine name and age to create a unique hash
        System.out.println(hash);
        return hash;
    }

     void m1 (){

    }
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, must be equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different classes or null, not equal
        }
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age; // Compare name and age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
