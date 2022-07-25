import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth. \nAnswer:");
        int birthYear,zodiacPercentage=12,result;
        String sign = "";
        birthYear = input.nextInt();
        result=birthYear%zodiacPercentage    ;
        if (birthYear > 0) {

            if (result==0) {
                sign="monkey";
            }else if (result==1)   {
                sign= "cockerel";
            }
            else if (result==2)   {
                sign= "dog";
            }
            else if (result==3)   {
                sign= "pig";
            }
            else if (result==4)   {
                sign= "mice";
            }
            else if (result==5)   {
                sign= "bull";
            }
            else if (result==6)   {
                sign= "tiger";
            }
            else if (result==7)   {
                sign= "rabbit";
            }
            else if (result==8)   {
                sign= "dragon";
            }
            else if (result==9)   {
                sign= "snake";
            }
            else if (result==10)   {
                sign= "horse";
            }
            else if (result==11)   {
                sign= "sheep";
            }
            System.out.println("Zodiac sign  : "+sign);


        } else {
            System.out.println("hatali giris yaptiniz");
        }
    }
}
