package giris;
import java.util.Scanner;

public class alan_bul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double alan;

        System.out.println("Ucgenin kenar uzunluklarini giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int cevre = a + b + c;
        int u = cevre / 2;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Verilen degerlere göre ucgenin alani: " + alan);


    }
}
