public class StringFamily {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("capacity is  " + stringBuilder.capacity());
        stringBuilder.append("01234");
        System.out.println("capacity is  " + stringBuilder.capacity());
        StringBuilder secoundStringBuilder = new StringBuilder(2);
        System.out.println(secoundStringBuilder.capacity());
        secoundStringBuilder.append("0123456789");
        System.out.println(secoundStringBuilder.capacity());
        secoundStringBuilder.append("01234567890123456789");
        System.out.println(secoundStringBuilder.capacity());

        System.out.println("------------------------------ end capacity ");

        StringBuilder stBuilder = new StringBuilder();
        String string = new String("st");
        System.out.println("hash code of stBuilder " + System.identityHashCode(stBuilder));
        System.out.println("hashcode of string " + System.identityHashCode(string));
        string+="hi";
        System.out.println("hash code string " + System.identityHashCode(string));
        stBuilder.append("hi");
        System.out.println("hash code of stBuilder " + System.identityHashCode( stBuilder));
        System.out.println("------------------------------ end test change value  ");
        string+= "moh".toUpperCase();
        System.out.println("hash code string after call toUpperCase method " + System.identityHashCode(string));
        stBuilder.append("moh".toUpperCase());
        System.out.println("hash code string builder after call toUpperCase method " + System.identityHashCode(stBuilder));

        System.out.println("------------------------------ end test call toUpperCase");
    }
}
