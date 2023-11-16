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


        int T = Integer.parseInt(bufr.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(bufr.readLine());

            bufw.write("Case #" + Integer.toString(i) + ": " +
                        Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + '\n');
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}