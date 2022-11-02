public class SmartPhone extends Device {

    private long imei;

    public SmartPhone(double weight, long memory, long imei) {
        super("Bravo de Esmolfe", weight, memory);
        this.imei = imei;
    }

    public long getIMEI() {
        return imei;
    }

    public boolean isHeavy() {
        return getWeight() > 100;
    }

}
