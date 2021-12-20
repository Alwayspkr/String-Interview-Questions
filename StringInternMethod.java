public class StringInternMethod {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello"); //HeapMemory
        System.out.println(s1==s2);

        s2 = s2.intern(); //heap to scp
        System.out.println(s1==s2);
    }
}
