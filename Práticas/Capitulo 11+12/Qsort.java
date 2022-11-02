import java.util.List;
import java.util.stream.Collectors;

public class Qsort{

    public static List<Integer>quicksort(List<Integer> xs){
        if(xs.size()<=1)return xs;

        var x0=xs.get(0);
        var a = xs.stream().filter(xi->xi<x0).collect(Collectors.toList());
        var b = xs.stream().filter(xi->xi==x0).collect(Collectors.toList());
        var c = xs.stream().filter(xi->xi>x0).collect(Collectors.toList());

        a.addAll(b);
        a.addAll(c);
        
        return a;
    }
    public static void main(String[] args) {
        System.out.println("I'm alive");
        List<Integer> a = List.of(2,1,4,3);
        List<Integer> a_sorted = quicksort(a);

        System.out.println(a);
        System.out.println(a_sorted);

    }
}