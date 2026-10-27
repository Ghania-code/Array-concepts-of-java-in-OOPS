public class Laptop extends ElectronicProduct{
     private int ramGB;
  
  Laptop(String name, double price,Date manufacturingDate,int warrantyMonths,int ramGB){
      super(name,price, manufacturingDate,warrantyMonths);
       this.ramGB=ramGB;

  }

@Override
public void  displayDetails(){
    super.displayDetails();
    System.out.println("RAMGB:"+ramGB);

}
}