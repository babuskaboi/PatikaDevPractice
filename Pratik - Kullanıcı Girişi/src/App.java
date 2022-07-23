import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz");
        userName=inp.nextLine();

        System.out.println("şifreniz:");
        password=inp.nextLine();

        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("Giris yaptiniz");
        }
        else{
            System.out.println("Bilgileriniz yanlış");
        }

    }
}
