import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufr.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                bufw.write(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                bufw.write("*");
            }
            bufw.write('\n');
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                bufw.write(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                bufw.write("*");
            }
            bufw.write('\n');
        }
        bufw.flush();
        bufw.close();
        bufr.close();
    }
}