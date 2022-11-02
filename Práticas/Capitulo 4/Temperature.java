public class Temperature{
    private double t;
    public Temperature(){
        t=0.0;
    }

    public void setCelsius(double celsius){
        t=celsius;
    }

    public double toCelsius(){
        return t;
    }

    public void setFahrenheit(double f){
        t=(f-32)/1.8;
    }

    public double toFahrenheit(){
        return 1.8*t + 32;
    }
    public static void main(String[] args){
        Temperature t= new Temperature();
        System.out.println(t.toCelsius());
        System.out.println(t.toFahrenheit());

        t.setCelsius(37.0);
        System.out.printf("Febre em ºF: %f%n", t.toFahrenheit());

        t.setFahrenheit(98.6);
        System.out.printf("Febre em ºC: %f%n", t.toCelsius());
    }
}