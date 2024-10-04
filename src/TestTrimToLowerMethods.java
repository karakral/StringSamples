public class TestTrimToLowerMethods {

    public void testTrimToLowerMethods(){
        String a =  "hi";
        System.out.println("String first value         " + System.identityHashCode( a));
        String b =  new String ("hi");
        a += "bo";
        System.out.println("String changed value       " + System.identityHashCode( a));

        StringBuilder s = new StringBuilder();
        s.append("hi");
        System.out.println("string builder first value  " +System.identityHashCode(s));
        s.append("hd5gh5h56jh67j56j6j76j67j767j6grttttt5h5h546h5gtttttruyrururuytttttttt");
        System.out.println("string builder change value " +System.identityHashCode(s));

        StringBuilder sNew = new StringBuilder();
        sNew.append("mohsen");
        System.out.println(System.identityHashCode(sNew));
        sNew.append("hellyujtyjtyjntyntyhnntyn56j67jm78jm7km7m7m7m7mo".toUpperCase());
        System.out.println(System.identityHashCode(sNew));

        String sample1  = "hellyujtyjtyjntyntyhnntyn56j67jm78jm7km7m7m7m7mo";
        System.out.println(System.identityHashCode(sample1));
        sample1 = sample1.toUpperCase();
        System.out.println(System.identityHashCode(sample1));
    }
}
