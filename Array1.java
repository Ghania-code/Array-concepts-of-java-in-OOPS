import java.util.Scanner;
public class Array1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

int number[]=new int[size];
 for(int i=0; i<size; i++){
    System.out.println("Enter the number:"+i);
    number[i]=sc.nextInt();
 
 }
System.out.print("Searching number:");
int searchNumber=sc.nextInt();

for(int i=0; i<number.length; i++){
    if(number[i]==searchNumber){
      System.out.println("Given values at index:"+i);
}
}
}
}
