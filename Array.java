import java.util.Scanner;
public class Array{
public static void main(String args[]){      //String of array
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] marks=new int[size];                     //array defining 
//int marks[]=new int[6];                     
//int marks[]={1,2,3};                         //zero indexed array value storage
 //marks[0]=97;
 //marks[1]=22;
 //marks[2]=21;


//input
for(int i=0; i<size; i++){
marks[i]=sc.nextInt();
}

//output
for(int i=0; i<size; i++){
System.out.println(marks[i]);
}
}
}