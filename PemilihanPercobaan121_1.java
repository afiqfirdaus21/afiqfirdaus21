import java.util.Scanner;

public class PemilihanPercobaan121_1{
    public static void main(String[] args){
        Scanner input21 = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");

        String hasil;
        int angka = input21.nextInt();

        hasil = (angka % 2 == 0) ? " Bilangan Genap " : "Bilangan Ganjil";
        System.out.println(angka+ "adalah" + hasil );
    }
}