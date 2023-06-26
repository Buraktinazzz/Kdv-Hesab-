import java.util.Scanner;

public class main {
    public static void main(String[] args) {
double tutar, kdvoranı, kdvliucret, toplam;
kdvoranı = 0.18;
Scanner input = new Scanner(System.in);
System.out.print("Ucret tutarini giriniz: ");
tutar = input.nextDouble();

System.out.println("KDVsiz Ucret " + tutar);
kdvliucret = tutar * kdvoranı;
toplam = tutar + kdvliucret;

System.out.println("KDVli Ucretiniz: " + toplam);
    }
}