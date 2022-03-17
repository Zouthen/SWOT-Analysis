package RISK_Analysis;

import java.util.Random;

public class RiskAnalysis {
    Random rand = new Random();
    int i;

    void go() {
        Risk[] risk = new Risk[25];

        System.out.println(Colors.WHITE_BRIGHT+ "NO. Risk name" + "           Pro Con Sev level" +
                Colors.RESET);
        for (i = 0; i < 25; i++) {
            risk[i] = new Risk();
            System.out.println();

            risk[i].setPro(rand.nextInt(1+5) + 1);
            risk[i].setCon(rand.nextInt(1+5) + 1);
            risk[i].setSeverity(risk[i].getCon() * risk[i].getPro());

            if (risk[i].getSeverity() <= 5) {
                risk[i].setLevel(Colors.GREEN_BRIGHT + "VERY_LOW" + Colors.RESET);

            } else if (risk[i].getSeverity() <= 10) {
                risk[i].setLevel(Colors.GREEN + "LOW" + Colors.RESET);

            }else if (risk[i].getSeverity() <= 15) {
                risk[i].setLevel(Colors.YELLOW + "MEDIUM" + Colors.RESET);

            }else if (risk[i].getSeverity() <= 20) {
                risk[i].setLevel(Colors.RED + "HIGH" + Colors.RESET);

            }else {
                risk[i].setLevel(Colors.RED_BRIGHT + "VERY_HIGH" + Colors.RESET);
            }

            System.out.println("#" + (i+1) + ": Risk number " + (i+1) + "       " +
                    risk[i].getPro() + "   " + risk[i].getCon() + "   " + risk[i].getSeverity() +
                    "   " + risk[i].getLevel());
        }
    }

    public static void main(String[] args) {
        new RiskAnalysis().go();

    }
}