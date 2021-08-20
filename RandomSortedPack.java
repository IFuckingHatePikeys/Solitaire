/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFirstPack;

public class RandomSortedPack {

    public int [] FinalRandomSortedPack;
    public int [] ListOfPlayingCards;
    private int NumOfCard;
    
    public RandomSortedPack() {
        FinalRandomSortedPack = new int[36];
        ListOfPlayingCards = new int[36];
        NumOfCard = 0;
        
        for(int suit = 1; suit<5;suit++){
            for(int num = 0; num<9; num++){
                ListOfPlayingCards[NumOfCard] = suit*10+num;
                NumOfCard++;

            }
        }
    }
    
    private int[] ShufflePack(int CardList[],int ShuffledPack[]){
        Calculator calc = new Calculator(2,'/',8);
        int RandomNumOfCard;
        int RandomNumOfCard2;
        int From0To35 = 0;
        for(int i = 0;i<36;i++){
           RandomNumOfCard = calc.getRandomNumFromA_ToB(0,(35-i));
           RandomNumOfCard2 = RandomNumOfCard ;
           ShuffledPack[From0To35] = CardList[RandomNumOfCard];
           From0To35++;
           for(int j = 0;j<((35-i)-RandomNumOfCard2);j++){
               CardList[RandomNumOfCard]=CardList[RandomNumOfCard+1];
               RandomNumOfCard++;
           }   
        }
        return(ShuffledPack);
    }
    
    public int[] GetRandomSortedPack(){
        return(ShufflePack(ListOfPlayingCards,FinalRandomSortedPack));
    }
}
