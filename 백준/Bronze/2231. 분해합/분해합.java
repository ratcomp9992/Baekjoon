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

        int min = Integer.MAX_VALUE;
        for (int i = N; i >= 1; i--) {
            int sum = i;
            int temp = i;

            while(temp / 10 > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum + temp % 10 == N) {
                min = i;
            }
        }

        if (min == Integer.MAX_VALUE) {
            bufw.write("0");
        } else {
            bufw.write(Integer.toString(min));
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}