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

        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < chess.length; i++) {
            bufw.write(chess[i] - Integer.parseInt(st.nextToken()) + " ");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}