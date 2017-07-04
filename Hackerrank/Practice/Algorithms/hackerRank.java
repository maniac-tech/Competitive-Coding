import java.util.*;
import java.io.*;
public class String args[] {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        for (int test = 1; test <= q; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            char array[] = new char[]{'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
            int ptr = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ptr <= 9 && str.charAt(i) == array[ptr]) ++ptr;
            }
            if (ptr == 10) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}