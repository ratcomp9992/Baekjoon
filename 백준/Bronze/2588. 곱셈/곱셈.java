import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));


        int A = Integer.parseInt(bufr.readLine());
        int B = Integer.parseInt(bufr.readLine());

        bufw.write (Integer.toString(A * (B % 10)) + '\n');
        bufw.write (Integer.toString(A * (B / 10 % 10)) + '\n');
        bufw.write (Integer.toString(A * (B / 100)) + '\n');
        bufw.write (Integer.toString(A * B));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}