import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Random;
import java.util.Vector;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;

/**
 * Cipher
 */
public class Cipher {

    public static String normalized(String naturalText){

        //toLowerCase() - serve para converter a string em letras minusculas
        //NFD - Canonical decomposition (decomposição canónica)
        //replaceAll("[^a-zA-Z0-9 ]","") - vai "trocar" todos os caracteres diferentes (a-zA-Z0-9 ) por ("")

        String Norm_Text = new String();

        Norm_Text=Normalizer.normalize(naturalText,Form.NFD).replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        return Norm_Text;
    }



    public static String encode(String plainText, int cols){

        StringBuilder plainText2 = new StringBuilder(plainText);
        int tamanho=plainText2.length();

        while(tamanho%cols!=0){
            Random random = new Random();
            int random_int = random.nextInt(plainText.length()-1);    //escolhe uma posição aleatoria da string (plainText)
            char random_char = plainText.charAt(random_int);        //caracter escolhido aleatoriamente

            tamanho+=1;     //atuliazação do tamanho
            plainText2.append(random_char); //adicionar o caracter escolhido à nova string (plainText2)

        }

        //System.out.println(plainText2);
        //System.out.println(plainText2.length());

        //
        //Criação da cifra
        //
        StringBuilder cifra = new StringBuilder();

        for(int u=0;u<cols;u++){            //inicio de cada coluna
            for(int t=u;t<plainText2.length();t+=cols){     //posições dos caracteres que formam a linha
                cifra.append(plainText2.charAt(t));     //adiciona cada caracter à string cifra 
            }
        }

        //
        //Criação da cifra
        //


        return cifra.toString();

    }

    public static List<Integer> findDividers(int x){

        List<Integer> Dividers = new ArrayList<Integer>(); 

        for(int i=1; i<=x ;i++){
            if(x%i==0)         //descobre os divisores de x
                Dividers.add(i);    //adiciona à lista os divisores
            
        }

        return Dividers;
    }

    public static List<String> explore(String candidate, List<String> words) {
        List<String> result = new Vector<>();

        for (var word : words) {
            if (candidate.startsWith(word)) {
                var suffix = candidate.substring(word.length()); // candidate = word + su
                var children = explore(suffix, words);
                for (var child : children) {
                    var solution = String.format("%s %s", word, child);
                    result.add(solution);
                }
            }
        }

        if(result.size()==0)
            result.add(candidate);
        
        return result;
    }


    public static List<String> breakCipher(String cipherText, List<String> words){

        List<Integer> D = findDividers(cipherText.length());
        List<Integer> complementar = new ArrayList<Integer>();
        List<String> hipoteses = new ArrayList<String>();

    
        for(int i=0;i<D.size();i++){
            for(int l=1; l<=cipherText.length();l++){
                if(D.get(i)*l==cipherText.length())
                    complementar.add(l);
            }
        }

        
        for(int p=0; p<complementar.size();p++){
            StringBuilder string = new StringBuilder();
            for(int j=0;j<complementar.get(p);j++){
                for(int k=j;k<cipherText.length();k+=complementar.get(p))
                    string.append(cipherText.charAt(k));
            } 
            hipoteses.addAll(explore(string.toString(), words));        // verificar se exite alguma frase dentro da cifra
        }

        return hipoteses;
    }

   


}