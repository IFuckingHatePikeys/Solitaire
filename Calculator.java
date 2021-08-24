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
    String[] NumberInFinalSON = new String[100];

        
        
    public Calculator() {
        scan = new Scanner(System.in);
        flag = false;
        for(int i =0;i<100;i++){
            NumberInFinalSON[i] = "0";
        }
    }
    public int getRandomNumFromA_ToB(int min,int max){
        return(min + (int)(Math.random() * (max-min+1)));
    }
    
    private void ChangeScaleOfNotation(String StrNumber,int StartSON, int FinalSON){
        int NumberIn10SON = 0;
        int[] Number = new int[StrNumber.length()];
        for(int i = 0;i<StrNumber.length(); i++){            
            switch (String.valueOf(StrNumber.charAt(StrNumber.length() - i -1))) {
                case "A":
                    Number[i]=10;
                    break;
                case "B":
                    Number[i]=11;
                    break;
                case "C":
                    Number[i]=12;
                    break;
                case "D":
                    Number[i]=13;
                    break;
                case "E":
                    Number[i]=14;
                    break;
                case "F":
                    Number[i]=15;
                    break;
                default:
                    Number[i] = Integer.parseInt(String.valueOf(StrNumber.charAt(StrNumber.length() - i -1)));
                    break;
            }
        }
        for(int i = 0;i<StrNumber.length();i++){
            System.out.println(Number[i]);
        }
        //convert to 10-Scale of location
        for(int i = 0;i<StrNumber.length();i++){
            NumberIn10SON += Number[i]*(Math.pow(StartSON, i));
        }
        int i=0;
        while(NumberIn10SON!=0){
            switch (NumberIn10SON%FinalSON) {
                case 10:
                    NumberInFinalSON[i] = "A";
                    break;
                case 11:
                    NumberInFinalSON[i] = "B";
                    break;
                case 12:
                    NumberInFinalSON[i] = "C";
                    break;
                case 13:
                    NumberInFinalSON[i] = "D";
                    break;
                case 14:
                    NumberInFinalSON[i] = "E";
                    break;
                case 15:
                    NumberInFinalSON[i] = "F";
                    break;
                default:
                    NumberInFinalSON[i] = String.valueOf(NumberIn10SON%FinalSON);
                    break;
            }
            NumberIn10SON = NumberIn10SON/FinalSON;
            i++;
        }
        for(int j =99;j>=0;j--){
            if(NumberInFinalSON[j].equals("0") == false)
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
        ChangeScaleOfNotation(scan.next(), scan.nextInt(), scan.nextInt());
    }
 
    
    public Integer getTestInt(){
        return testInt;
    }
    public void setTestInt(Integer var){
        testInt = var;
    }
}
