package myFirstPack;

import java.util.*;

public class Calculator {
    private int testInt;
    private char operation;
    private double num1;
    private double num2;
    private double value;
    boolean flag;
    Scanner scan;
    int[] NumberInFinalSON = new int[100];

        
        
    public Calculator() {
        scan = new Scanner(System.in);
        flag = false;
        for(int i =0;i<100;i++){
            NumberInFinalSON[i] = 0;
        }
    }
    public int getRandomNumFromA_ToB(int min,int max){
        return(min + (int)(Math.random() * (max-min+1)));
    }
    
    private void ChangeScaleOfNotation(int Number,int StartSON, int FinalSON){
        int LastCipher;
        int NumberIn10SON = 0;
        int lenght = Integer.toString(Number).length();
        //convert to 10-Scale of location
        for(int i = 0;i<lenght;i++){
            LastCipher = Number%10;
            NumberIn10SON += LastCipher*(Math.pow(StartSON, i));
            Number = Number/10;
        }
        int i=0;
        while(NumberIn10SON!=0){
            NumberInFinalSON[i]= NumberIn10SON%FinalSON;
            NumberIn10SON = NumberIn10SON/FinalSON;
            i++;
        }
        for(int j =99;j>=0;j--){
            if(NumberInFinalSON[j]!=0)
                flag = true;
            if(flag == true){
                System.out.print(NumberInFinalSON[j]);
            }
        }
        System.out.println("");
    }
    
    private double countUpValue(){
        switch (operation) {
            case '+':
                return(num1+num2);
            case '-':
                return(num1-num2);
            case '*':
                return(num1*num2);
            case '/':
                return(num1/num2);
            default:
                break;
        }
        return 0;
    }
    
    public void IChangeScaleOfNotation(){
        System.out.println("Введите число, затем введите систему счисления, в которой он находится,");
        System.out.println("а потом систему счисления, в которую число нужно перевести.");
        System.out.println("");
        System.out.println("Например 10 2 10, означает: переведи число 10 в двоичной системе в десятичную систему.");
        ChangeScaleOfNotation(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }
 
    
    public Integer getTestInt(){
        return testInt;
    }
    public void setTestInt(Integer var){
        testInt = var;
    }
}
