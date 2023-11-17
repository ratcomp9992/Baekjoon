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

        int N = Integer.parseInt(bufr.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bufr.readLine());
        int v = Integer.parseInt(bufr.readLine());

        int cnt = 0;
        while (st.hasMoreElements()) {
            if (Integer.parseInt(st.nextToken()) == v) {
                cnt++;
            }
        }

        bufw.write(Integer.toString(cnt));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}