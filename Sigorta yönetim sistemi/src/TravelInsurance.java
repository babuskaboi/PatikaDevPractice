import java.util.Date;

public class TravelInsurance extends Insurance {
    public TravelInsurance(String insuranceName, double insuranceFee, Date startDate, Date endDate) {
        super(insuranceName, insuranceFee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Seyahat sigortası ücreti hesaplama mantığı buraya gelecek
        // Örnek olarak sabit bir ücret döndürelim
        return 50.0; // Örnek bir ücret
    }
}
