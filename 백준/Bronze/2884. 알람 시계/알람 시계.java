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

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M >= 45) {
            bufw.write(Integer.toString(H) + " " + Integer.toString(M-45));
        }
        else if (H == 0) {
            bufw.write( "23 " + Integer.toString(M+15));
        }
        else {
            bufw.write(Integer.toString(H-1) + " " + Integer.toString(M+15));
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}