
package myFirstPack.src.java;

public class RandomSortedPack {

    private final int [] finalRandomSortedPack;
    private final int [] listOfPlayingCards;


    /**
     We fill our deck with cards. a card is a number stored in the form xy,
     where x is a number from 1 to 4 indicating the suit, and y is one of the 9 possible values of the card
     */
    public RandomSortedPack() {
        finalRandomSortedPack = new int[36];
        listOfPlayingCards = new int[36];
        int numOfCard = 0;
        
        for(int suit = 1; suit<5;suit++){
            for(int num = 0; num<9; num++){
                listOfPlayingCards[numOfCard] = suit*10+num;
                numOfCard++;
            }
        }
    }
    //shuffles cards from cardList and places them in shuffledPack
    private int[] shufflePack(int[] cardList, int[] shuffledPack){
        int randomNumOfCard;
        int randomNumOfCard2;
        int from0To35 = 0;
        for(int i = 0;i<36;i++){
           randomNumOfCard = Calculator.getRandomNumFromA_ToB(0,(35-i));
           randomNumOfCard2 = randomNumOfCard ;
           shuffledPack[from0To35] = cardList[randomNumOfCard];
           from0To35++;
           for(int j = 0;j<((35-i)-randomNumOfCard2);j++){
               cardList[randomNumOfCard]=cardList[randomNumOfCard+1];
               randomNumOfCard++;
           }   
        }
        return(shuffledPack);
    }

    public int[] getRandomSortedPack(){
        return(shufflePack(listOfPlayingCards, finalRandomSortedPack));
    }
}
