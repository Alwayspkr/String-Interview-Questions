public class EqualsOperators {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String ("Hello");
        String s4 = "Hello";

        if(s1==s4)
            System.out.println("s1 and s4 equal");
        else
            System.out.println("s1 and s4 not equal");
        if(s1==s2)
            System.out.println("s1 and s2 equal");
        else
            System.out.println("s1 and s2 not equal");

        System.out.println("__________________________________________________________");

        if(s1.equals(s4))
            System.out.println("s1 and s4 equal");
        else
            System.out.println("s1 and s4 not equal");
        if(s1.equals(s2))
            System.out.println("s1 and s2 equal");
        else
            System.out.println("s1 and s2 not equal");

    }
}
