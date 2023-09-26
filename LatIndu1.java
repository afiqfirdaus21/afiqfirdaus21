import java.util.Scanner;

 public class LatIndu1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int username = 222;
        int password = 111;
        System.out.println("Masukkan Username dan Password");
        System.out.println("Username   : ");
        int user = input.nextInt();
        System.out.println("Password   : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat anda berhasil login!");
        }else{
            System.out.println("Harap cek kembali username dan password anda");
        }
    }
 }