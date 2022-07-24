import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int month,day;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doğduğunuz Ayı Giriniz (1-12) : ");
        month = input.nextInt();
        System.out.print("Lütfen Doğduğunuz Günü Giriniz (1-31) : ");
        day = input.nextInt();

        if ((month == 12 && day >=22) || (month == 1 && day <= 21)){
            System.out.println("Oğlak Burcusunuz...");
        }else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)){
            System.out.println("Kova Burcusunuz...");
        }else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)){
            System.out.println("Balık Burcusunuz...");
        }else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)){
            System.out.println("Koç Burcusunuz...");
        }else if ((month == 4 && day >=21) || (month == 5 && day <= 21)){
            System.out.println("Boğa Burcusunuz...");
        }else if((month == 5 && day >= 22) || (month == 6 && day <=22 )){
            System.out.println("İkizler Burcusunuz...");
        }else if ((month == 6 && day >= 23) || (month == 7 && day <=22)){
            System.out.println("Yengeç Burcusunuz...");
        }else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)){
            System.out.println("Aslan Burcusunuz...");
        }else if((month == 8 && day >= 23) || (month == 9 && day <= 22)){
            System.out.println("Başak Burcusunuz...");
        }else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)){
            System.out.println("Terazi Burcusunuz...");
        }else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)){
            System.out.println("Akrep Burcusunuz...");
        }else if((month == 12 && day >= 22) || (month == 12 && day <= 21)){
            System.out.println("Yay Burcusunuz...");
        }else{
            System.out.println("Hatalı Bir Giriş Yaptınız, Lütfen Tekrar Deneyiniz...");
        }
    }
}
