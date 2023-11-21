import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] check = new boolean[31];
        for (int i = 0; i < 28; i++) {
            check[Integer.parseInt(bufr.readLine())] = true;
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {
                bufw.write(Integer.toString(i) + '\n');
            }
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}