import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int a,b,n,ikius = 1,ikiushesap = 0;
        Scanner oku = new Scanner(System.in);
        int sinir = oku.nextInt();
        for(int si=0;si<sinir;si++)
        {
            a = oku.nextInt();
            b = oku.nextInt();
            n = oku.nextInt();

            for(int i = 0; i < n ; i++)
            {
                for(int k=0;k<=i;k++){
                    if(k==0)
                        ikius = 1;
                    else
                        ikius *=2;
                    ikiushesap += ikius * b;
                }
                ikiushesap += a;
                out.print(""+ikiushesap+" ");
                ikiushesap = 0;
            }
            out.print("\n");
        }
    }
}