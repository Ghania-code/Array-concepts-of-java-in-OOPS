public class Date{
    private int day;
    private int month;
    private int year;
 

Date(int day,int month,int year){
         this.day=day;
         this.month=month;
         this.year=year;

}


Date(Date d){
     this.day=d.day;
      this.month=d.month;
       this.year=d.year;



}
 
public void display(){
   System.out.println("Date");
   System.out.printf("%02d/%02d/%04d\n",day,month,year);
}
}
