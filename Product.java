public class Product{
  private static int nextid=1;
  private final String ID_SUFFIX="PRD";
  private final String name;
  private double price;
  private  Date manufacturingDate;
  private String ID;

Product(String name,double price,Date manufacturing){
    this.name=name;
    this.price=price;
    this.manufacturingDate=manufacturing;
    this.ID=ID_SUFFIX+String.format("%02d",nextid++);
}


public String getID(){
    return ID;

}
     
public void displayDetails(){
   System.out.println("Name:"+name);
   System.out.println("price:"+price);
   System.out.println("ID:"+ID);
   manufacturingDate.display();
   
}
}
     
    
    