import java.util.Scanner;
import java.util.Arrays;
public class Dizide_EnYakin {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("Bir sayi girin: ");
        int n=inp.nextInt();



        int yakin1 = list[0];
        int yakin2 = list[0];

        for (int i : list) {
            if (i < n) {
                yakin1 = i;
            }
            if (i > n) {
                yakin2 = i;
            }
        }

        System.out.println("Girilen sayidan kucuk en yakin sayi : " + yakin1);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + yakin2);
    }
}
