package model;

public class PercentSplit extends Split {
    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    double percent;
    public PercentSplit(User user, double percent) {
        super(user);
        this.percent=percent;
    }
}

