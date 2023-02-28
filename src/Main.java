import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Bir sayının basamak değerlerini toplayan program 1643 = 1+6+4+3 = 14
        Scanner input = new Scanner(System.in);
        int sayi;
        int total = 0 ;
        int basamak ;

        System.out.print("Sayıyı giriniz : ");
        sayi = input.nextInt();

        int sayi2 = sayi;

        while (sayi2 != 0 ){
            basamak = sayi2 % 10;
            total += basamak;
            sayi2 /= 10 ;

        }
        System.out.println("Basamakların toplamından elde edilen sayı : "+ total);
        }
}
