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
        int C = Integer.parseInt(bufr.readLine());

        if (B + C < 60) {
            bufw.write(Integer.toString(A) + " " + Integer.toString(B + C));
        }
        else if (A + (B + C)/60 >= 24){
            bufw.write(Integer.toString(A + (B + C)/60 - 24) + " " + Integer.toString((B + C) % 60));
        }
        else {
            bufw.write(Integer.toString(A + (B + C)/60) + " " + Integer.toString((B + C) % 60));
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}