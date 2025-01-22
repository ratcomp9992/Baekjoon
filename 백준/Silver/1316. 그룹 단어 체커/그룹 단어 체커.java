import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(bufr.readLine());
        int answer = 0;
        for (int i = 0; i < testcase; i++) {
            if (!countGroupWord(bufr.readLine())) {
                answer++;
            }
        }

        bufw.write(Integer.toString(answer));

        bufw.flush();
        bufw.close();
        bufr.close();
    }

    static boolean countGroupWord(String word) {
        boolean[] alphabet = new boolean[26];

        alphabet[word.charAt(0) - 'a'] = true;

        for (int i = 1; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (word.charAt(i - 1) != word.charAt(i)
                    && alphabet[index]) {
                return true;
            }
            alphabet[index] = true;
        }

        return false;
    }
}