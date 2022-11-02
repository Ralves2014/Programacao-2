import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;


public class SimpleFileProvider extends AbstractProvider {
    
    public File file;
    public List<String> palavras;

    public SimpleFileProvider(String fileName) throws java.io.IOException{

        file= new File(fileName);
        this.palavras = new ArrayList<String>();

        if (file.exists())
        {
            FileReader inStream = new FileReader(file);
            BufferedReader reader = new BufferedReader(inStream);

            String str = new String();

            while((str=reader.readLine()) != null){
                String p = Cipher.normalized(str);

                if(p.length()>0 && !palavras.contains(p))
                    palavras.add(p);
            }


            reader.close();

            Collections.sort(palavras);

        }
        else
        {
            throw new IOException();
        }
        
    }

    public List<String> getWords(){
        return palavras;
    }
}