public class card {
    private int rank;
    private int suit;

    public card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public void SetRank(int rank){
        this.rank = rank;
    }
    public int GetRank(){
        return rank;
    }

    public void SetSuit(int suit){
        this.suit = suit;
    }
    public int GetSuit(){
        return suit;
    }
     public static String RankString(int rank){
        switch (rank){
            case 1: return "Ace";
            case 2: return "deuce";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "It is the invalid rank value.";

        }}

         public  static String SuitString(int suit){
             switch (suit){
                 case 1: return "Clubs";
                 case 2: return "Diamonds";
                 case 3: return "hearts";
                 case 4: return "Spades";
                 default: return "It is the invalid suit value.";

             }
     }
}
