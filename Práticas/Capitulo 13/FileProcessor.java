import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class FileProcessor {

    public static boolean exists(String f) {
        File file = new File(f);

        return file.exists();
    }

    public static boolean save(String f, String[] words) {
        if (exists(f)) {
            return false;
        } else {
            File file = new File(f);
            try (FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream outStream = new ObjectOutputStream(fos);
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));) {

                for (String s : words) {
                    bw.write(s);
                    bw.newLine();
                }
            } catch (IOException ignored) {

            }

        }
        return exists(f);
    }

    public static String scan(String f) {

        File file = new File(f);
        String result= new String();

        if (!exists(f)) {
            return "ERRO";
        } else {
            List<String> list = new ArrayList<String>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }

            } catch (IOException exception) {
                return "ERRO";

            }

            try {
                String largest = list.stream().max(Comparator.comparingInt(String::length)).get();
                String shortest = list.stream().min(Comparator.comparingInt(String::length)).get();
                Double avarageSize = list.stream().mapToDouble(String::length).average().getAsDouble();
                result = String.format("%s|%s|%.3f", shortest, largest, avarageSize);
                

            } catch (NoSuchElementException e) {
                return "ERRO";
            }

            return result;

        }

    }

    public static void main(String[] args) {
        System.out.print(FileProcessor.scan("empty"));
    }

}