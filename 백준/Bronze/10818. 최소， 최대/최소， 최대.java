import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufr.readLine());
        int N = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        st = new StringTokenizer(bufr.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (min >= num) {
                min = num;
            }
            if (max <= num) {
                max = num;
            }
        }

        bufw.write(Integer.toString(min) + " " + Integer.toString(max));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}