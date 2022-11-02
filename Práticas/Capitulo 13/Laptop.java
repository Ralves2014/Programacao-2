public class Laptop extends Device {

    private boolean risc;

    public Laptop(String brand, double weight, boolean risc) {
        super(brand, weight, 32768);
        this.risc = risc;
    }

    public boolean isRISC() {
        return risc;
    }

    public boolean isHeavy() {
        return getWeight() > 750;
    }

}
