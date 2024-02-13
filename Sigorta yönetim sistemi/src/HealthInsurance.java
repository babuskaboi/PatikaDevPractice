import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance(String insuranceName, double insuranceFee, Date startDate, Date endDate) {
        super(insuranceName, insuranceFee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Sağlık sigortası ücreti hesaplama mantığı buraya gelecek
        // Örnek olarak sabit bir ücret döndürelim
        return 100.0; // Örnek bir ücret
    }
}
