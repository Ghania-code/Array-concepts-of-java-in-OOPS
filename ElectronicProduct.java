public class ElectronicProduct extends Product{
    private int warrantyMonths;

public ElectronicProduct(String name,double price,Date manufacturing,int warrantyMonths){
   super(name,price,manufacturing);
   this.warrantyMonths=warrantyMonths;
}
  
@Override 
public void displayDetails(){
    super.displayDetails();
    System.out.println("WarrantyMonths:"+warrantyMonths);

}
}
   
    
    
    