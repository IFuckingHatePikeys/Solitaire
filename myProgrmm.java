package myFirstPack;


import java.util.Stack;





public class myProgrmm {
    public static final int net = 100000000;
        
    
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
          System.out.println(result*100 + " Процентов");
        //Calculator calc = new Calculator(2,'/',8);
       // System.out.println(calc.getValue());
        
     //   Me gleb = new Me();
       // System.out.println(gleb.salutInterfase());

       // Stack<Person> myStack = new Stack();
      //  myStack.push(gleb);
        
      //  Person chel = (Person) myStack.pop();
      //  System.out.println(chel.getFavoriteColorInterfase());
        
    }
    
}
