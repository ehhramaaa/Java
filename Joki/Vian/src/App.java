import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner UTS = new Scanner(System.in);
        int jbrs, jkol;
        int tbrs, tkol;

        System.out.print("Masukan jumlah baris :");
        jbrs = UTS.nextInt();

        if (jbrs % 2 == 0) {
            jbrs = jbrs + 1;
        }

        jkol = (jbrs * 2) - 1;
        
        if (jkol % 2 == 0) {
            jkol = jkol + 1;
        }

        tbrs = (jbrs / 2) + 1;
        tkol = (jkol / 2) + 1;
        

        System.out.println("jumblah baris:" + jbrs);
        System.out.println("jumblah kolom:" + jkol);
        System.out.println("titik tengah baris :" + tbrs);
        System.out.println("titik tengah kolom :" + tkol);

        for (int i = 1; i <= jbrs; i++) {
            for (int j = 1; j <= jkol; j++) {
                if (j == (i + tbrs) - jbrs) {
                    System.out.print("* ");
                } else if (j == (i + jkol) - tbrs) {
                    System.out.print("* ");
                } else if (j == (jbrs - i) + 1 && j >= ((tbrs / 2) + 1)) {
                    System.out.print("* ");
                } else if (j == (jkol - i) + 1 && j < (jkol + ((tbrs / 2) + 1)) - tbrs) {
                    System.out.print("* ");
                } else if (i == jbrs && j >= (tbrs) && j <= tkol) {
                    System.out.print("* ");
                } else if (i == 1 && j >= tkol && j <= (jbrs + tbrs) - 1) {
                    System.out.print("* ");
                } else if (i == 1 && j >= tkol && j <= (jbrs + tbrs) - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
