import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<ArrayList> array_list = new ArrayList<ArrayList>();

        int n = oku.nextInt();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int d = oku.nextInt();
            for(int k=0;k<d;k++) {
                int q = oku.nextInt();
                temp.add(q);
            }
            array_list.add(temp);
        }

        int x = oku.nextInt();
        for(int i=0;i<x;i++)
        {
            try{
                int array = oku.nextInt();
                int indis = oku.nextInt();
                array--;
                indis--;
                System.out.println(array_list.get(array).get(indis));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }

        }

    }
}