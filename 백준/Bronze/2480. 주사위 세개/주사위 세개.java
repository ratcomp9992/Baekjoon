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
        int num3 = Integer.parseInt(st.nextToken());

        if (num1 == num2 && num2 == num3) {
            bufw.write(Integer.toString(10000 + num1*1000));
        }
        else if (num1 != num2 && num2 != num3 && num3 != num1) {
            bufw.write(Integer.toString(100 * Math.max(num1, Math.max(num2, num3))));
        }
        else {  // 같은 눈이 2개
            if (num1 == num2) {
                bufw.write(Integer.toString(1000 + num1*100));
            }
            else if (num2 == num3) {
                bufw.write(Integer.toString(1000 + num2*100));
            }
            else {
                bufw.write(Integer.toString(1000 + num3*100));
            }
        }
        bufw.flush();
        bufw.close();
        bufr.close();
    }
}