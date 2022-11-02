import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryProvider extends AbstractProvider {

    public List<String> w = new ArrayList<String>();

    public List<String> getWords(){

        
        for(int p=0;p<w.size();p++){
            for(int pn=p+1;pn<w.size();pn++){
                if (w.get(p)==w.get(pn))
                    w.remove(p);
            }
        }
    

        Collections.sort(w);

        return w;
    }
    public void addWord(String word){

        String palavra = new String();

        if (word.length()>0){
            palavra = Cipher.normalized(word);
            w.add(palavra);
        }

    }
}