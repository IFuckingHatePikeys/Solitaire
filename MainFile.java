package myFirstPack;


import java.util.Stack;





public class MainFile {
    public static final int net = 1000000;
        
    
    public static void main(String[] args) {        
        int count = 0;
        double result;
          for(int i = 0;i<net;i++){
              Patience patience = new Patience();
              if(patience.IsPatienceSuccessful() == true){
                  count++;
              }
          }
          result = 1.0*count/net;
          System.out.println(result*100 + " Процента");
    }
    
}
