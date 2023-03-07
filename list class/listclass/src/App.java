public class App {
    public static void main(String[] args) throws Exception {
        MyList<Integer> arr=new MyList<Integer>();

        arr.add(5);
        arr.add(5);
        arr.add(7);
        arr.add(5);
        

        System.out.println(arr.size());

        arr.remove(2);

        System.out.println(arr.size());
        
    }
}
