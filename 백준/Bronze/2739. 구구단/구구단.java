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

        for (int i = 1; i <= 9; i++) {
            bufw.write(Integer.toString(N) + " * " + Integer.toString(i) + " = " + Integer.toString(N*i) + '\n');
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}