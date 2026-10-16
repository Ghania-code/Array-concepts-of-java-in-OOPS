public class Game{
   Deck deck;
   Player Players[];

   Game(Player Players[]){
    deck=new Deck();
    deck.shuffle();
    

    this.Players=Players;
   
   for(int i=0; i<Players.length; i++){
        Players[i].receiveCards(deck.dealCards());
    
   }
}


 public void showPlayerCards(){
     for(int i=0; i<Players.length; i++){
       Players[i].showHand();
}
}
}