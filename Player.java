public class Player{
    String name;
    Card hand[];
    int cardCount=0;
    
    
    

Player(String name){
    this.name=name;
    hand=new Card[5];
}

public String getName(){
   return name;
}

public void showHand(){
   for(int i=0; i<hand.length; i++){
        if(hand[i]!=null){
        System.out.println(hand[i]);
    }  
   }
}

public boolean receiveCards(Card cards){
        if(cardCount<hand.length){
          hand[cardCount++]=cards;
            return true;
    }
    else{
           return false;
   }
  }

}