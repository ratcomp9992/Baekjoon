import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] S = bufr.readLine().toCharArray();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i = 0; i < S.length; i++) {
            if (alphabet[S[i] - 97] == -1) {
                alphabet[S[i] - 97] = i;
            }
        }

        for (int i : alphabet) {
            bufw.write(i + " ");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}