import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi = oku.nextInt();
        for(int i = 1;i<=10;i++)
            out.println(sayi + " x " + i + " = " + (sayi*i));
    }
}