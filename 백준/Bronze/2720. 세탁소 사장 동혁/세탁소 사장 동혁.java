import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(bufr.readLine());
        for (int i = 0; i < testcase; i++) {
            int[] answer = new int[4];
            int price = Integer.parseInt(bufr.readLine());

            int index = 0;
            for (Unit u : Unit.values()) {
                if (price / u.price >= 1) {
                    answer[index] = price / u.price;
                    price %= u.price;
                }
                index++;
            }

            for (int j = 0; j < 4; j++) {
                bufw.write(Integer.toString(answer[j]) + " ");
            }
            bufw.write('\n');
        }

        bufw.flush();
        bufw.close();
        bufr.close();
    }

    enum Unit {
        QUARTER(25),
        DIME(10),
        NICKEL(5),
        PENNY(1);

        private final int price;

        Unit (int price) {
            this.price = price;
        }
    }
}