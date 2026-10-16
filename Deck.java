import java.util.Random;
public class Deck{
  private Card cards[];
  private String Suit[]={"Spades","Clubs","Diamonds","Hearts"};
  private String Rank[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
  int nextCard=0;
  int count=0;

  Deck(){
         int count=0;
         cards=new Card[52];
         for(int i=0; i<Suit.length; i++){
            for(int j=0; j<Rank.length; j++){
                cards[count++]=new Card(Suit[i],Rank[j]);
         }
     }
}
  
  
public void shuffle(){
  Random ran=new Random();     
  for(int i=0; i<100000; i++){
      Card t=cards[0];
      int temp=ran.nextInt(52);                                //takes the address of random card and gave it to the temp
      cards[0]=cards[temp];
      cards[temp]= t;                                

}
}
 
public void displayDeck(){                                  //java by default call the toString function hiddenly
   for(int i=0; i<cards.length; i++){
       System.out.println(cards[i]);
 }
}

public Card dealCards(){
   if(nextCard<52){
     return cards[nextCard++];
   }
   else
     return null;
}

public int remainingCards(){
   return cards.length-nextCard;
}
}