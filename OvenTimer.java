/**
 * very simple oven timer program
 * lets you know how long something has been in the oven, how much time is left, and how much time has been spent so far
 */

public class OvenTimer {
    static int EXPECTED_MINS = 40;
    

    public static int remainingMins(int minsIn){
        int minsLeft = EXPECTED_MINS - minsIn;
        return minsLeft;
    }
    public static int prepTime(int numLayers){
        int prepTime = numLayers *2;
        return prepTime;
    }
    public static int totalTime(int numLayers, int actualMinsIn){

        return prepTime(numLayers) + actualMinsIn;
    }

    public static void main(String args[]){
        
        
    System.out.println(totalTime(3, 20));

    }




}