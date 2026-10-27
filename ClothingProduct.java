public class ClothingProduct extends Product{
    String size;

  ClothingProduct(String name,double price,Date manufacturingDate,String size){
     super(name,price,manufacturingDate);
     this.size=size;
}


@Override
public void displayDetails(){
   super.displayDetails();
   System.out.println("size:"+size);

}
}
  