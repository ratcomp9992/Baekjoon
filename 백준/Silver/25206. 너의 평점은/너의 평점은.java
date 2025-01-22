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

        int testcase = 20;
        double sumOfScore = 0;
        double result = 0;

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(bufr.readLine());
            st.nextToken();

            double score = Double.parseDouble(st.nextToken());
            String subjectScore = st.nextToken();
            if (!subjectScore.equals("P")) {
                result += score * Grade.getScore(subjectScore);
                sumOfScore += score;
            }
        }

        bufw.write(Double.toString(result / sumOfScore));

        bufw.flush();
        bufw.close();
        bufr.close();
    }

    enum Grade {
        APLUS("A+", 4.5),
        AZERO("A0", 4.0),
        BPLUS("B+", 3.5),
        BZERO("B0", 3.0),
        CPLUS("C+", 2.5),
        CZERO("C0", 2.0),
        DPLUS("D+", 1.5),
        DZERO("D0", 1.0),
        F("F", 0.0);

        private final String grade;
        private final double score;

        Grade (String grade, double score) {
            this.grade = grade;
            this.score = score;
        }

        static double getScore(String grade) {
            for (Grade i : Grade.values()) {
                if (i.grade.equals(grade)) {
                    return i.score;
                }
            }
            throw new IllegalArgumentException("과목에 해당하는 점수를 찾을 수 없음 " + grade);
        }
    }
}