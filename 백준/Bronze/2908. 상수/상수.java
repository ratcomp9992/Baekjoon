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
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        num1 = num1- num1/100*100 + num1%10*100 + num1/100 - num1%10;
        num2 = num2- num2/100*100 + num2%10*100 + num2/100 - num2%10;

        bufw.write(Integer.toString(Math.max(num1, num2)));

        bufw.flush();
        bufw.close();
        bufr.close();
    }
}