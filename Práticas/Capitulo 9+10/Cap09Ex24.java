import java.text.Normalizer;
import java.text.Normalizer.Form;

class Cap09Ex24 {

    public static boolean isPalindrome(String word) {
        boolean value=true;
        String normalize= new String();
        normalize=Normalizer.normalize(word,Form.NFD).replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int t= normalize.length()/2;
        
        for(int i=0; i<t;i++){
            char l1 = normalize.charAt(i);
            char l2 = normalize.charAt(normalize.length()-i-1);
            
            if(l1!=l2)
                value=false;
            
        }   
        return value;
        
    }


    public static void main(String[] args) {

        String s = new String("Atai a gaiola, saloia gaiata!");
        String normalize= new String();
        normalize=Normalizer.normalize(s,Form.NFD).replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        System.out.println(s);
        System.out.println(normalize);
        System.out.println(normalize.length());


        System.out.println(isPalindrome(normalize));

    }
}
