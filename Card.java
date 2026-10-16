public class Card{
  
  private final String Suit;
  private final String Rank;

  Card(String Suit, String Rank){
      this.Suit=Suit;
      this.Rank=Rank;
  }

 public String getSuit(){
      return Suit;
 }

  public String getRank(){
      return Rank;
 }


 public String toString(){                                       
      return Suit+"of"+Rank;
 }
}
 

