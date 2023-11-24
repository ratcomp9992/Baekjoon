import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = bufr.readLine();
        int i = Integer.parseInt(bufr.readLine());

        bufw.write(word.charAt(i - 1));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}