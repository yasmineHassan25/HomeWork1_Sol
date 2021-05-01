public class Deck {

    public static int Ranks_Num = 13;
    public static int Suits_Num = 4;
    private card[][] obj;

    public Deck(){
        //Create object from card class..
        obj =new card[Ranks_Num][Suits_Num];

        for(int i=1 ; i<=Ranks_Num ; i++){
            for (int j=1; j<=Suits_Num ; j++){
               obj[i-1][j-1] = new card(i , j);
            }
        }
    }

    public card GetCard(int suit, int rank) {
        return obj[rank-1][suit-1];
    }
}
