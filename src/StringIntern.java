package src;

import java.util.Objects;

public class StringIntern {

    public static void main(String[] args) {
        String s1 = "qaz";
        String s2 = new String("qaz");
        String s3 = new String("teh");
        String s4 = s1.intern();
        String s5 = s2.intern();

        if (s3 == s4) {
            System.out.println("s3 == s4");
        }
        if (s1 == s5) {
            System.out.println("s1 equal s5");
        }

        String str1 = new String("Hello"); // Creates a String object in the heap
        String str2 = str1.intern();       // Adds "Hello" to the constant pool if not already present

        // Original string (str1) remains in the heap
        System.out.println(str1); // Output: Hello
        System.out.println(str2); // Output: Hello

        // Check references
        if (str1 == str2) {
            System.out.println("str1 == str2"  + str1 == str2);
        }
        else { System.out.println("str1 != str2");}
        System.out.println(" str2 hashcode system identity hashcode " + System.identityHashCode(str1));
        str2 = null;
        System.gc();
        System.out.println(" str2 hashcode identify hashcode  " + System.identityHashCode(str1));
        System.out.println(" str2 hashcode object hashcode method  " + Objects.hashCode(str2));



    }

}
