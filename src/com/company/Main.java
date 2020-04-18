import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> liczby = new ArrayList<>();
        boolean czyPoprawanie = true;
        int a = scan.nextInt();
        int b = scan.nextInt();

        if ( a == b) {
            while (a != b) {
                a = b;
                b = scan.nextInt();
            }
        }



        while (scan.hasNextInt()) {
            liczby.add(scan.nextInt());
        }

        if (a >= b) {
            for (int i = 0; i < (liczby.size() - 2); ++i) {
                if (liczby.get(i) == 0) {
                    break;
                }

                if (liczby.get(i) >= liczby.get(i + 1)) {
                    continue;
                } else {
                    czyPoprawanie = false;
                    break;
                }
            }
        }
        else if (a <= b) {
            for (int i = 0; i < (liczby.size() - 2); ++i) {
                if (liczby.get(i) == 0) {
                    break;
                }
                if (liczby.get(i) <= liczby.get(i + 1)) {
                    continue;
                } else
                    czyPoprawanie = false;
                break;
            }
        }

        if( czyPoprawanie == true) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}