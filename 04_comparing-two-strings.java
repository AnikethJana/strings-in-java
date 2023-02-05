// we compare strings in java using "==" or equals();
// equals(); compares value and == compares memory references.

public class assign {
    public static void main(String[] args) {
        
        String s1 = "PWSKILLS";
        String s2 = new String("PWSKILLS");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
