/**
 * @author sunjiantao
 * @date 2019-10-20
 */
public class CheckStraightLine {
    public static void main(String[] args) {
        CheckStraightLine checkStraightLine = new CheckStraightLine();
//        checkStraightLine.checkStraightLine()

    }

    public boolean checkStraightLine(int[][] coordinates) {
        double radio = 0;
        boolean spe = false;
        for (int i = 0; i < coordinates.length; i++) {
            int[] num0 = coordinates[0];
            if (i == 0) {
                continue;
            } else if (i == 1) {
                //算比率
                int[] num1 = coordinates[1];
                if ((num1[1] - num0[1]) == 0) {
                    spe = true;
                } else {
                    radio = (num1[0] - num0[0]) / (num1[1] - num0[1]);
                }
            } else {
                int[] numcur = coordinates[i];
                if (spe == true) {
                    if ((numcur[1] - num0[1]) == 0) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    if ((numcur[1] - num0[1]) == 0) {
                        return false;
                    }
                    double curRadio = (numcur[0] - num0[0]) / (numcur[1] - num0[1]);
                    if (curRadio != radio) {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
