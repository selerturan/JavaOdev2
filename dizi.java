
import java.util.Scanner;

public class dizi {
    public static void main(String[] args) {
        int [] dizi= new int[5];
        int bos=0;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<dizi.length; i++)
        {
            System.out.println("Sayıyı giriniz:");

            dizi[i]= scanner.nextInt();
        }

       for (int i=0; i<dizi.length-1; i++)
       {
           for (int j=i; j<dizi.length; j++)
           {
               if (dizi[i]<dizi[j])
               {
                   bos = dizi[i];
                   dizi[i]=dizi[j];
                   dizi[j]=bos;
               }
           }
       }

       for (int i=0; i<dizi.length; i++)
       {
           System.out.println(dizi[i]);
       }

    }
}
