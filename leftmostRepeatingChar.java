import java.util.*;

public class leftmostRepeatingChar {

    public static int indexOfLRC(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String argsp[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(indexOfLRC(str));
    }
}
