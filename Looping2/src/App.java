import java.util.Scanner;

public class App {
    private static Scanner Input = new Scanner(System.in);
    private static int Baris, Kolom;

    // Done Star Double Diamond
    public static void Latihan_1() {
        System.out.print("Masukan Jumlah Baris :");
        Baris = Input.nextInt();
        System.out.print("Masukan Jumlah Kolom :");
        Kolom = Input.nextInt();

        if (Kolom != Baris) {
            System.out.print("Mohon Masukan Nilai Yang Sama Dengan Baris ! \n");
            Latihan_1();
        }

        if (Baris % 2 == 0) {
            Baris = Baris + 1;
        } else if (Kolom % 2 == 0) {
            Kolom = Kolom + 1;
        }

        int tBaris1, tBaris2, tKolom, Pertengahan;
        tBaris1 = Baris / 2 + 1;
        tKolom = tBaris1;

        Baris = Baris * 2 - 1;

        if (Baris % 2 == 0) {
            Baris = Baris + 1;
        } else if (Kolom % 2 == 0) {
            Kolom = Kolom + 1;
        }

        tBaris2 = Baris - tBaris1 + 1;

        Pertengahan = Baris / 2 + 1;

        for (int i = 1; i <= Baris; i++) {
            for (int j = 1; j <= Kolom; j++) {
                if (i <= tKolom && j <= tBaris1 && j == (tKolom - i) + 1) {
                    System.out.print("* ");
                } else if (j == (i - tKolom) + 1) {
                    System.out.print("* ");
                } else if (j == (Pertengahan + tKolom) - i) {
                    System.out.print("* ");
                } else if (j >= tKolom && i >= tBaris2 && j == (Baris + tBaris1) - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    // Done Star E
    public static void Latihan_2() {
        System.out.print("Masukan Jumlah Baris :");
        Baris = Input.nextInt();
        System.out.print("Masukan Jumlah Kolom :");
        Kolom = Input.nextInt();

        if (Kolom != Baris) {
            System.out.print("Mohon Masukan Nilai Yang Sama Dengan Baris ! \n");
            Latihan_2();
        }

        if (Baris % 2 == 0) {
            Baris = Baris + 1;
        } else if (Kolom % 2 == 0) {
            Kolom = Kolom + 1;
        }

        int tBaris1, tBaris2, tKolom, Pertengahan;
        tBaris1 = Baris / 2 + 1;
        tKolom = tBaris1;

        Baris = Baris * 2 - 1;

        if (Baris % 2 == 0) {
            Baris = Baris + 1;
        } else if (Kolom % 2 == 0) {
            Kolom = Kolom + 1;
        }

        tBaris2 = Baris - tBaris1 + 1;

        Pertengahan = Baris / 2 + 1;

        for (int i = 1; i <= Baris; i++) {
            for (int j = 1; j <= Kolom; j++) {
                if (i <= tKolom && j <= tBaris1 && j == (tKolom - i) + 1) {
                    System.out.print("* ");
                } else if (i <= Pertengahan && j == (i - tKolom) + 1) {
                    System.out.print("* ");
                } else if (i >= Pertengahan && i <= tBaris2 && j == (Pertengahan + tBaris1) - i) {
                    System.out.print("* ");
                } else if (i >= Pertengahan && i >= tBaris2 && j == (i - tBaris2) + 1) {
                    System.out.print("* ");
                } else if (i == Pertengahan && j >= tKolom) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    // FIXME Star W
    public static void Latihan_3() {
        System.out.print("Masukan Jumlah Baris :");
        Baris = Input.nextInt();
        System.out.print("Masukan Jumlah Kolom :");
        Kolom = Input.nextInt();

        if (Kolom != Baris) {
            System.out.print("Mohon Masukan Nilai Yang Sama Dengan Baris ! \n");
            Latihan_3();
        }

        if (Baris % 2 == 0) {
            Baris = Baris + 1;
        } else if (Kolom % 2 == 0) {
            Kolom = Kolom + 1;
        }

        int tKolom1, tKolom2, tBaris, Pertengahan;
        tKolom1 = Kolom / 2 + 1;
        tBaris = tKolom1;

        Kolom = Kolom * 2 - 1;

        tKolom2 = Kolom - tKolom1 + 1;

        Pertengahan = Kolom / 2 + 1;

        for (int i = 1; i <= Baris; i++) {
            for (int j = 1; j <= Kolom; j++) {
                if (i <= tBaris && j <= tKolom1 && j == (tBaris - i) + 1) {
                    System.out.print("* ");
                } else if (j <= Pertengahan && j == (i - tBaris) + 1) {
                    System.out.print("* ");
                } else if (j <= Pertengahan && j == (Pertengahan + tBaris) - i) {
                    System.out.print("* ");
                } else if (j >= Pertengahan && i >= tBaris && j == (i + tBaris) - 1) {
                    System.out.print("* ");
                } else if (j >= Pertengahan && i >= tBaris && j == (Kolom + tKolom1) - i) {
                    System.out.print("* ");
                } else if (j >= Pertengahan && i <= tBaris && j >= tKolom2 && j == (Kolom - tKolom1) + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void SelectProgram() throws InterruptedException {
        try {
            for (int i = 1; i <= 3; i++) {

                if (i != 2) {
                    for (int j = 1; j <= 30; j++) {
                        System.out.print("=");
                    }
                } else {
                    for (int n = 1; n <= 3; n++) {
                        if (n != 2) {
                            for (int x = 1; x <= 5; x++) {
                                System.out.print(" ");
                            }
                        } else {
                            System.out.print(" Latihan Looping ");
                        }
                    }
                }
                System.out.println();
            }

            String[] Choise = { "1.Latihan 1", "2.Latihan 2", "3.Latihan 3" };
            for (String Choises : Choise) {
                System.out.println(Choises);
            }

            System.out.print("Select Program : ");
            int SelectChoise = Input.nextInt();
            switch (SelectChoise) {
                case 1:
                    Latihan_1();
                    break;
                case 2:
                    Latihan_2();
                    break;
                case 3:
                    Latihan_3();
                    break;
            }
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan : " + e);
            Thread.sleep(2000);
        }
    }

    public static void main(String[] args) throws Exception {
        do {
            SelectProgram();
            System.out.print("Apakah Ingin Mengulang Program? (y/n): ");
            Input.nextLine();
            String repeat = Input.nextLine();

            if (repeat.toLowerCase().equals("n")) {
                break;
            }
            System.out.print("\n");

        } while (true);
    }
}