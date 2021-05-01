public class Check {
    public static void main(String[] args){
        Deck deck1 = new Deck();

        for (int rank=1 ; rank<=13 ; rank++){
            for (int suit=1 ; suit<=4 ; suit++){
                card c1 = deck1.GetCard(suit , rank);
                System.out.print(card.RankString(c1.GetRank())+" of "+card.SuitString(c1.GetSuit()) +"\t");
            }
            System.out.println();
        }

    }
}
