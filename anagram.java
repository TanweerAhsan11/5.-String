import java.util.*;

public class anagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char c1[] = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);

        char c2[] = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);

        return s1.equals(s2);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(isAnagram(s1, s2));

    }
}
