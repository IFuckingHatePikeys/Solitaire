package myFirstPack;

public abstract class Person {
    
    private int random_number;
    
    private int min_salut;
    
    private int max_salut;
    
    private String myArray[];
    
    public Person(){
        min_salut = 0;
        max_salut = 3;
        myArray = new String[]{" Здравcтвуйте! "," Привет! "," Салам! "," Абоба, друг !"};
        random_number = min_salut + (int)(Math.random() * (max_salut-min_salut+1));
    }
    
    public String salutInterfase(){
        
        return salut();
    }
    
    
    private String salut(){
 
        return (myArray[random_number]);
    }
    
    public String getFavoriteColorInterfase(){
        
        return (getFavoriteColor());
    }
    
    public abstract String getFavoriteColor();
}