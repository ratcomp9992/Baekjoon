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
        char[] arr = bufr.readLine().toCharArray();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (arr[i] - '0');
        }

        bufw.write(Integer.toString(sum));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}