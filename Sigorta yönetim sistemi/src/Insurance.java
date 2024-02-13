import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insuranceFee;
    private Date startDate;
    private Date endDate;

    public Insurance(String insuranceName, double insuranceFee, Date startDate, Date endDate) {
        this.insuranceName = insuranceName;
        this.insuranceFee = insuranceFee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters

    public abstract double calculate();
}
