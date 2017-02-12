/**
 * Created by chaominggu on 2017/2/12.
 */
public class SimpleDotCom {
    int[] cellLocation;
    int hitNum = 0;
    int dataFromString;
    //boolean flag = false;
    public void setCellLocation(int[] location){
        cellLocation = location;
    }

    public String checkTheGuess(String userGuess) {
        int guess = Integer.parseInt(userGuess);

        String result = "Miss";

        for (int cell : cellLocation) {
            if (dataFromString==guess) {
                result = "Please Change Your Input!";
                //flag = true;
                break;
            } else {
                if ((cell == guess)) {
                    result = "Hit!";
                    hitNum++;
                    break;
                }

            }
        }

            if (hitNum == cellLocation.length) {
                result = "Kill!!";
            }
//            if(flag){
//
//            }
            return result;
        }


    public void getString(String string){
        String dataString = string;
        dataFromString = Integer.parseInt(dataString);
    }
}
