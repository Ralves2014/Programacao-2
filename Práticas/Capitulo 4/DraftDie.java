import java.util.Random;

public class DraftDie {

    public static void main(String[] args){
        Die d1= new Die();

        System.out.println(d1.toss());
        System.out.println(d1.toss());
        System.out.println(d1.toss());

    }
}

class Die{
    private Random generator;

    public Die (){
        generator=new Random();
    }
    public int toss(){
        return 1+generator.nextInt(6);          //os numeros estao entre 1 e 6
    }
}