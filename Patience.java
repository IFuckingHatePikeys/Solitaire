/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFirstPack;

/**
 *
 * @author DarkLord
 */
public class Patience {
    boolean Successful;
    RandomSortedPack RandomPack;
    int[] pack;

    public Patience() {
        Successful = false;
        RandomPack = new RandomSortedPack();
        pack = RandomPack.GetRandomSortedPack();
    }
    public boolean IsPatienceSuccessful(){
        return(PlaySolitaire(pack));
    }
    private boolean PlaySolitaire(int [] PatiencePack){
        int LastCard = PatiencePack[35];
        boolean AnyMotion;
        int iDubler;
        int iDubler2;
        
        for(int i = 0;i<34;i++){
            iDubler = i;
            iDubler2 = i;
            AnyMotion = false;
            if(PatiencePack[1] == LastCard){
                Successful = true;
                break;
            }
            if((PatiencePack[i]/10) == (PatiencePack[i+2]/10) || (PatiencePack[i]%10) == (PatiencePack[i+2]%10)){
                AnyMotion = true;
                for(int j = 0; j<(35-i);j++){
                    PatiencePack[iDubler]=PatiencePack[iDubler+1];
                    iDubler++;
                }
                i=-1;
            }
            if(AnyMotion == false && PatiencePack[iDubler2+2]==LastCard){
                if(iDubler2+2 != 35){
                    if(PatiencePack[iDubler2+3] == LastCard)
                        break;
                }                   
            }
        }
        return(Successful);
    }
}
