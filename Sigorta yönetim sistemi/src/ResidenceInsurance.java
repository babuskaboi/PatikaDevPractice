import java.util.Date;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String insuranceName, double insuranceFee, Date startDate, Date endDate) {
        super(insuranceName, insuranceFee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Konut sigortası ücreti hesaplama mantığı buraya gelecek
        // Örnek olarak sabit bir ücret döndürelim
        return 200.0; // Örnek bir ücret
    }
}
