public class App {
    static int negative(int x) {
        if (x <= 0) {
            
            return x;
        } else {
            System.out.print(x + " ");
            return negative(x - 5);
        }
    }

    static int positive(int x,int y) {
        if(x<=0){
            
        }
        if(x>y){
            return x;
        }
        else{
            System.out.print(x+" ");
            return positive(x+5, y);
        }
        
        
    }

    public static void main(String[] args) throws Exception {
        int num=45;
        positive(negative(num),num);
        

    }
}
