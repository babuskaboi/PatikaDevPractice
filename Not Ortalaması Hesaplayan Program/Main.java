import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Değişken oluşturma
    int mat, fizik, kimya, turkce, muzik;

    // Scanner tanımlama
    Scanner inp = new Scanner(System.in);

    // Kullanıcıdan değer alma
    System.out.println("Mat değerini giriniz:");
    mat = inp.nextInt();

    System.out.println("kimya değerini giriniz:");
    kimya = inp.nextInt();

    System.out.println("fizik değerini giriniz:");
    fizik = inp.nextInt();

    System.out.println("turkce değerini giriniz:");
    turkce = inp.nextInt();

    System.out.println("muzik değerini giriniz:");
    muzik = inp.nextInt();
    // ortalama hesaplaması
    double notOrt = (mat + fizik + muzik + kimya + turkce) / 5;
    // not ortalamasını ekrana yazma
    System.out.println("not ortalaması: " + notOrt);

  }

}