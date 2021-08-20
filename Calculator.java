package myFirstPack;


public class Calculator {
    private int testInt;
    private char operation;
    private double num1;
    private double num2;
    private double value;
    
    public Calculator(double numF,char operatorr,double numS) {
        operation = operatorr;
        num1 = numF;
        num2 = numS;
    }
    public double getValue(){
        if(operation != '+' & operation != '-' & operation != '*' & operation != '/'){
            return(228.228);
        }
        else
            return countUpValue();
    }
    
    public int getRandomNumFromA_ToB(int min,int max){
        return(min + (int)(Math.random() * (max-min+1)));
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
    
    
    public Integer getTestInt(){
        return testInt;
    }
    public void setTestInt(Integer var){
        testInt = var;
    }
}
