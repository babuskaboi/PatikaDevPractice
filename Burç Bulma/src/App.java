public class App {
    public static void main(String[] args) throws Exception {
        int N=0;


        if(N%2==1){
            System.out.println("Weird");
        }
        else{
            if(N>=2&&N<=5){
                System.out.println("Not Weird");

            }
            if(N>=6&&N<=20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }
    }
}
