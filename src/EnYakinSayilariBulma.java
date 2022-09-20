import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayilariBulma {
    public static void main(String[] args) {
        int[] sayiDizisi={15,12,788,1,-1,-778,2,0};
        int girilenSayi,kucukEnYakin=0,buyukEnYakin=0;

        System.out.print("Dizi : {");
        for (int i=0;i<sayiDizisi.length;i++){
            if (i==sayiDizisi.length-1){
                System.out.print(sayiDizisi[i]);
                break;
            }
            System.out.print(sayiDizisi[i]+",");
        }
        System.out.println("}");

        Arrays.sort(sayiDizisi);
        Scanner sc=new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        girilenSayi=sc.nextInt();
        for (int i=0;i<sayiDizisi.length;i++){
            if (girilenSayi<sayiDizisi[i] && i!=0){
                kucukEnYakin=sayiDizisi[i-1];
                buyukEnYakin=sayiDizisi[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+buyukEnYakin);

    }
}
