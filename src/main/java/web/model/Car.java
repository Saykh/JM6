package web.model;

public class Car {
    private String mark;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String mark, String model, int series) {
        this.mark = mark;
        this.model = model;
        this.series = series;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}

