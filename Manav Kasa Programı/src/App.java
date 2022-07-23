import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        double armutTutar,elmaTutar,domatesTutar,muzTutar,patlıcanTutar,toplamTutar=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("armut kac kilogram:");
        armutTutar=inp.nextDouble();
        toplamTutar+=armutTutar*2.14;

        System.out.println("elma kac kilogram:");
        elmaTutar=inp.nextDouble();
        toplamTutar+=elmaTutar*3.67;

        System.out.println("muz kac kilogram:");
        muzTutar=inp.nextDouble();
        toplamTutar+=muzTutar*0.95;

        System.out.println("domates kac kilogram:");
        domatesTutar=inp.nextDouble();
        toplamTutar+=domatesTutar*1.11;

        System.out.println("patlıcan kac kilogram:");
        patlıcanTutar=inp.nextDouble();
        toplamTutar+=patlıcanTutar*5.0;


        System.out.println("Toplam tutar:"+toplamTutar);
        

    }
}
