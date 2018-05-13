package emp;

public class HourlyEmp extends Employee implements IHourlyEmp {

    int hours;
    double rate;

    public HourlyEmp(String name) {
        super(name);
    }

    @Override
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
