import java.util.*;

public class patternSearchingImproved {

    public static void patternSearch(String txt, String pattern) {
        int n = txt.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m;) {
            int j;
            for (j = 0; j < m; j++) {
                if (pattern.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.print(i + " ");
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();
        String pattern = s.nextLine();
        patternSearch(txt, pattern);
    }
}
