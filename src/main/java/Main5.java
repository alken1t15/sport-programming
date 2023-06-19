import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
             str = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String name = "ASTN";
        String[] array = str.split("");
        Set<String> uniq = new HashSet<>(Arrays.asList(array));
        System.out.println(uniq);
        System.out.println(name.length()<=uniq.size());
    }
}
