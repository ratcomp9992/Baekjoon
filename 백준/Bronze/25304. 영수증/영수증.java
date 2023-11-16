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

        int X = Integer.parseInt(bufr.readLine());
        int N = Integer.parseInt(bufr.readLine());
        int sum = 0;

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufr.readLine());

            sum += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if (X == sum) {
            bufw.write("Yes");
        }
        else {
            bufw.write("No");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}