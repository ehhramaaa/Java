import java.util.Scanner;

public class App {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {

        // Inisialisasi Variable
        int Kolom, Baris, TengahKolom, TengahBaris, Choises, Pertengahan;
        String[] Choise = { "1. Kuda", "2. Diamond", "3. Logo X" };

        Scanner Input = new Scanner(System.in);
        do {
            try {
                // Just Opening
                for (int y = 0; y < 3; y++) {
                    if (y != 1) {
                        for (int x = 0; x <= 40; x++) {
                            System.out.print("=");
                        }
                        System.out.println("");
                    } else {
                        for (int i = 0; i < 3; i++) {
                            if (i != 1) {
                                for (int j = 0; j < 5; j++) {
                                    System.out.print("!");
                                }
                                if (i == 2) {
                                    System.out.println("");
                                }
                            } else {
                                System.out.print(" Program Bintang Berbasis Java ");
                            }
                        }
                    }
                }
                // End Opening

                // Choise Program
                for (String Choised : Choise) {
                    System.out.println(Choised);
                }
                System.out.print("Masukan Pilihan : ");
                Choises = Input.nextInt();

                switch (Choises) {
                    // Program Kuda
                    case 1:
                        try {
                            System.out.print("Masukan Jumlah Kolom : ");
                            Kolom = Input.nextInt();
                            System.out.print("\n");

                            System.out.print("Masukan Jumlah Baris : ");
                            Baris = Input.nextInt();

                            if (Baris != Kolom) {
                                System.out.print(
                                        "Agar Output Rapi Diharap Untuk Menginput Baris Sama Jumlahnya Dengan Kolom Terimakasih :) \n");
                                break;
                            }

                            if (Baris % 2 == 0) {
                                Baris = Baris + 1;
                            }

                            if (Kolom % 2 == 0) {
                                Kolom = Kolom + 1;
                            }

                            TengahKolom = Kolom / 2 + 1;
                            TengahBaris = Baris / 2 + 1;

                            for (int i = 1; i <= Baris; i++) {
                                for (int j = 1; j <= Kolom; j++) {
                                    if (i <= TengahKolom && j == (Baris - i) + 1) {
                                        System.out.print("* ");
                                    } else if (i == TengahBaris && j <= TengahKolom) {
                                        System.out.print("* ");
                                    } else if (i >= TengahKolom - 1 && j == (i - Baris) + Baris
                                            && i > (Kolom - i) + 1) {
                                        System.out.print("* ");
                                    } else if (i >= TengahKolom - 1 && j == (i - Baris) + TengahBaris
                                            && i > (Kolom - i) + 1) {
                                        System.out.print("* ");
                                    } else {
                                        System.out.print("  ");
                                    }
                                }
                                System.out.println("");
                            }
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                            Thread.sleep(2000);
                        }
                        break;

                    // Program Diamond
                    case 2:
                        try {
                            System.out.print("Masukan Jumlah Kolom : ");
                            Kolom = Input.nextInt();
                            System.out.print("\n");

                            System.out.print("Masukan Jumlah Baris : ");
                            Baris = Input.nextInt();

                            if (Baris != Kolom) {
                                System.out.print(
                                        "Agar Output Rapi Diharap Untuk Menginput Baris Sama Jumlahnya Dengan Kolom Terimakasih :) \n");
                                break;
                            }

                            if (Baris % 2 == 0) {
                                Baris = Baris + 1;
                            }

                            if (Kolom % 2 == 0) {
                                Kolom = Kolom + 1;
                            }

                            TengahKolom = Kolom / 2 + 1;
                            TengahBaris = Baris / 2 + 1;

                            for (int i = 1; i <= Kolom; i++) {
                                for (int j = 1; j <= Baris; j++) {
                                    if (j <= TengahKolom && i == (TengahBaris - j) + 1) {
                                        System.out.print("* ");
                                    } else if (j >= TengahKolom && i == (j - TengahBaris) + 1) {
                                        System.out.print("* ");
                                    } else if (i >= Kolom - j && j >= (Baris - TengahBaris) + 1
                                            && j >= (Baris + TengahBaris) - i
                                            && i == (Kolom + TengahKolom) - j) {
                                        System.out.print("* ");
                                    } else if (j <= TengahKolom && i > TengahBaris && j == (i - TengahBaris) + 1) {
                                        System.out.print("* ");
                                    } else {
                                        System.out.print("  ");
                                    }
                                }
                                System.out.println("");
                            }
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                            Thread.sleep(2000);
                        }
                        break;

                    // Program X
                    case 3:
                        try {
                            System.out.print("Masukan Jumlah Kolom : ");
                            Kolom = Input.nextInt();
                            System.out.print("\n");

                            System.out.print("Masukan Jumlah Baris : ");
                            Baris = Input.nextInt();

                            if (Baris != Kolom) {
                                System.out.print(
                                        "Agar Output Rapi Diharap Untuk Menginput Baris Sama Jumlahnya Dengan Kolom Terimakasih :) \n");
                                break;
                            }

                            if (Baris % 2 == 0) {
                                Baris = Baris + 1;
                            }

                            if (Kolom % 2 == 0) {
                                Kolom = Kolom + 1;
                            }

                            TengahKolom = Kolom / 2 + 1;
                            TengahBaris = Baris / 2 + 1;

                            Baris = (Baris + Baris) - 1;
                            Pertengahan = Baris / 2 + 1;
                            for (int i = 1; i <= Kolom; i++) {
                                for (int j = 1; j <= Baris; j++) {
                                    if (j <= Baris && j <= Pertengahan && i == j) {
                                        System.out.print("* ");
                                    } else if (j <= Pertengahan && i == (Pertengahan - j) + 1) {
                                        System.out.print("* ");
                                    } else if (j >= Pertengahan && j == (Pertengahan + i) - 1) {
                                        System.out.print("* ");
                                        // System.out.print("# ");
                                    } else if (j >= Pertengahan && j == (Baris - i) + 1) {
                                        System.out.print("* ");
                                        // System.out.print("# ");
                                    } else {
                                        System.out.print("  ");
                                    }
                                }
                                System.out.println("");
                            }
                        } catch (Exception e) {
                            System.out.println("Terjadi kesalahan: " + e.getMessage());
                            Thread.sleep(2000);
                        }
                        break;

                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                Thread.sleep(2000);
            }
            System.out.print("Apakah Anda ingin memilih program lain? (y/n): ");
            String Select = Input.next();

            if (Select.equalsIgnoreCase("n")) {
                break;
            }
            clearScreen();
        } while (true);

    }
}
