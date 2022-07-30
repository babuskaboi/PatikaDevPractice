public class App {

    static public int powrec(int a,int b){

        if(b==0){
            return 1;
        }
        return powrec(a, b-1)*a;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(powrec(5, 3));
    }
}
