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
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N + 1];


        for (int T = 0; T < M; T++) {
            st = new StringTokenizer(bufr.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int a = i; a <= j; a++) {
                basket[a] = k;
            }
        }

        for (int i = 1; i <= N; i++) {
            bufw.write(Integer.toString(basket[i]) + " ");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}