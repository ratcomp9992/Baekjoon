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

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        bufw.write (Integer.toString((A+B)%C) + '\n' +
                Integer.toString(((A%C) + (B%C))%C) + '\n' +
                Integer.toString((A*B)%C) + '\n' +
                Integer.toString(((A%C) * (B%C))%C));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}