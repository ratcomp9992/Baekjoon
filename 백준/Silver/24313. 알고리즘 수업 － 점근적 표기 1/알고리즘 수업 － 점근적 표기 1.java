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

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(bufr.readLine());
        int n0 = Integer.parseInt(bufr.readLine());

        if (a1 * n0 + a0 <= c * n0 && c >= a1) {
            bufw.write("1");
        } else {
            bufw.write("0");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}