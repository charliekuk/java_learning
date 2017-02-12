/**
 * Created by chaominggu on 2017/2/12.
 */
public class SimpleDotComTest {

    public static void main(String[] args) {
        int numOfGuess = 0;
        String userGuess = null;
        int randomNum = (int) (Math.random() * 5);
        int[] comLocation = {randomNum, randomNum + 1, randomNum + 2};
        String history = "10";
        GameHelper gameHelper = new GameHelper();
        SimpleDotCom dotCom = new SimpleDotCom();
        dotCom.setCellLocation(comLocation);
        Boolean testAlive = true;
        while (testAlive == true) {
            userGuess = gameHelper.getInput("Enter Your Guess");
            dotCom.getString(history);
            String result = dotCom.checkTheGuess(userGuess);
            System.out.println(result);
            history = userGuess;
            numOfGuess++;
            if (result.equals("Kill!!")) {
                    testAlive = false;
                    System.out.println("Your Have Guessed " + numOfGuess + " Times!");
                }

            }

        }


    }

