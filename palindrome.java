import java.util.*;

class palindrome {

    public static boolean isPalindrome(String p) {
        int i = 0;
        int j = p.length() - 1;
        while (i < j) {
            if (p.charAt(i) != p.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

        // StringBuilder rev = new StringBuilder(p);
        // rev.reverse();
        // return p.equals(rev.toString());
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String p = s.next();
        System.out.println(isPalindrome(p));
    }
}