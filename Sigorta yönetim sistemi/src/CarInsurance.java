import java.util.Date;

public class CarInsurance extends Insurance {
    public CarInsurance(String insuranceName, double insuranceFee, Date startDate, Date endDate) {
        super(insuranceName, insuranceFee, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Otomobil sigortası ücreti hesaplama mantığı buraya gelecek
        // Örnek olarak sabit bir ücret döndürelim
        return 300.0; // Örnek bir ücret
    }
}
