public class MethodsStringBuilder {
    public static void main(String[] args) {

        Integer integerMaxValue =  Integer.MAX_VALUE;
        System.out.println("integer max value " + integerMaxValue);
        StringBuilder str = new StringBuilder();
        str.append("Hello World");
        System.out.println(str.capacity());
        // description set minimum capacity for string builder
        str.ensureCapacity(20);
        System.out.println("capacity after call ensureCapacity method " + str.capacity());
        // description call toString cause of remove unused element in string builder
        // System.out.println(str.toString().length());
        // description remove unused element in string builder
        // str.trimToSize();
        //System.out.println(str.capacity());

        char[] charArray = new char[20];
        str.getChars(0, 11, charArray, 5);
        for (char ch : charArray) {
            System.out.print(ch);
        }
        //description below code will create exception, yes we know the capacity of str is 34 but it reserved it dosen't mean the length of that is capacity
        // or 34
        System.out.println("\n"+ "length of str " + str.length());
        System.out.println("\n" + "below code will create exception, yes we know the capacity of str is 34 but it reserved it ");
        char[] charArray2 = new char[50];
        str.getChars(20, 31, charArray, 5);
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
