public class App {
    public static void main(String[] args) throws Exception {
        fighter f1=new fighter("joe", 16, 70, 72,65);
        fighter f2=new fighter("alan", 19, 78, 70,50);

        Match match=new Match(f1, f2, 90, 60);

        match.run();

    }
}
