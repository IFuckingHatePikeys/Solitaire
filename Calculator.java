package myFirstPack;

public class Calculator {
    public static int getRandomNumFromA_ToB(int min,int max){
        return(min + (int)(Math.random() * (max-min+1)));
    }
}
