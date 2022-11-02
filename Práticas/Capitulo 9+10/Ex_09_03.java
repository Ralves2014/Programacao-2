

public class Ex_09_03 {
    public static void main(String[] args) {
        String str1 = new String("Olá Mundo!");
        String str2 = new String();

        str2=str1;

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
    }
}
