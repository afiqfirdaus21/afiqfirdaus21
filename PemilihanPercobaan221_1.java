import java.util.Scanner;

public class PemilihanPercobaan221_1{
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        String Nilai_huruf;

        System.out.print("Nilai uas : ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis *0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "remidi" : "tidak remidi";
        System.out.println("nilai akhir = "+total+ " sehingga "+ message);


        if (total>=80){
            Nilai_huruf="A";
        }else if (total>73){
            Nilai_huruf="B+";
        }else if (total>65){
            Nilai_huruf="B";
        }else if (total>60){
            Nilai_huruf="C+";
        }else if(total>50){
            Nilai_huruf="C";
        }else if (total>39){
            Nilai_huruf="D";
        }else {
            Nilai_huruf="E";
        }

        System.out.println("Kamu mendapatkan Grading akhir yaitu : " + Nilai_huruf);
    }
}