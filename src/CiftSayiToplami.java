import java.util.Scanner;
public class CiftSayiToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, toplam=0;

        do {
            System.out.print("Bir Sayı Giriniz:");
            a=input.nextInt();
            if (a % 4==0){
                toplam=toplam+a;
            }
        }while (!(a % 2==1));
        System.out.print("Toplam:" + toplam);
    }
}
