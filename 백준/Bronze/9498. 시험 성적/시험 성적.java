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

        int score = Integer.parseInt(st.nextToken());

        if (score >= 90) {
            bufw.write("A");
        }
        else if (score >= 80) {
            bufw.write("B");
        }
        else if (score >= 70) {
            bufw.write("C");
        }
        else if (score >= 60) {
            bufw.write("D");
        }
        else {
            bufw.write("F");
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}