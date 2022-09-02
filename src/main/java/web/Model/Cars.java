package web.Model;


public class Cars {

    private String model;
    private int series;
    private String vin;

    public Cars(String model, int series, String vin) {
        this.model = model;
        this.series = series;
        this.vin = vin;
    }

    public Cars() {
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", vin='" + vin + '\'' +
                '}';
    }
}
