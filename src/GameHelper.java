import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by chaominggu on 2017/2/12.
 */
public class GameHelper {
    public String getInput(String hint){
        String input = null;
        System.out.println(hint + ": ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();
            if (input.length()==0)
                return null;
        }catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return input;
    }
}
