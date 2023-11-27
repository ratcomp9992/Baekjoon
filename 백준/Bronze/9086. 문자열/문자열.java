import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufr.readLine());

        StringBuilder sb;
        for (int i = 0; i < T; i++) {
            String word = bufr.readLine();

            sb = new StringBuilder();
            sb.append(word.charAt(0)).append(word.charAt(word.length() - 1));
            bufw.write(sb.toString() + '\n');
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}