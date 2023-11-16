import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufr.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        bufw.write(Integer.toString(sum));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}