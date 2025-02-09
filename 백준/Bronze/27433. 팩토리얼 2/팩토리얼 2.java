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
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }

        bufw.write(Long.toString(result));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}