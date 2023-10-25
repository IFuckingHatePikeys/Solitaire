package myFirstPack.src.java;

public class Patience {
    private final int[] pack;

    public Patience() {
        pack = new RandomSortedPack().getRandomSortedPack();
    }
    public boolean playSolitaireAndGetResult(){
        boolean successful = false;
        int lastCard = pack[35];
        boolean anyMotion;
        int iDubler;
        int iDubler2;
        
        for(int i = 0;i<34;i++){
            iDubler = i;
            iDubler2 = i;
            anyMotion = false;
            //if there are only 2 cards left, then they can no longer form a three, which means the sequence is winning
            if(pack[1] == lastCard){
                successful = true;
                break;
            }
            /*
            if any of the threes has 2 outer cards of either the same
             value or the same suit, the central card is shifted to the side
             */
            if((pack[i]/10) == (pack[i+2]/10) || (pack[i]%10) == (pack[i+2]%10)){
                anyMotion = true;
                for(int j = 0; j<(35-i);j++){
                    pack[iDubler]=pack[iDubler+1];
                    iDubler++;
                }
                i=-1;
            }
            /*
             if we have reached the end of the laid out cards, and not a single combination has worked out for us,
             then we exit the cycle, since this combination of cards is losing
            */
            if(!anyMotion && pack[iDubler2+2]==lastCard){
                if(iDubler2+2 != 35){
                    if(pack[iDubler2+3] == lastCard)
                        break;
                }                   
            }
        }
        return(successful);
    }
}
