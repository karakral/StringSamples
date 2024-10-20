import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringSamples {
    public static void main(String[] args) {
//    StringFamily stringFamily = new StringFamily();
//    stringFamily.StringFamily();
//    MethodsStringBuilder methodsStringBuilder = new MethodsStringBuilder();
//    methodsStringBuilder.methodsStringBuilder();
//        TestTrimToLowerMethods testTrimToLowerMethods = new TestTrimToLowerMethods();
//        testTrimToLowerMethods.testTrimToLowerMethods();
        Reflection reflection = new Reflection();
        reflection.createClass();



//_______________________ test why we override hashcode and equal when useing hashcode Hashpam
//
        HashMap<Person, String> map = new HashMap<Person, String>();

        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        map.put(person1, "Person 1");
        map.put(person2, "Person 2");

        // Should print only one entry if hashCode() and equals() are overridden correctly
        System.out.println("Map size: " + map.size()); // Should be 1

        // Checking value associated with key person1
        System.out.println("Value for person1: " + map.get(person1)); // Should re
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("dg");

    }
}

