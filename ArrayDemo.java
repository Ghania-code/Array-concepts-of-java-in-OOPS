public class ArrayDemo{
   public static void main(String args[]){
         
     A list[]=new A[5];                          //Array of object create
     System.out.println(list);

 for(int i=0; i<list.length; i++){
      list[i]=new A(100);

  }

for(int i=0; i<list.length; i++){
list[i].displayA();
}

 for(int i=0; i<list.length; i++){
      list[i].setA(list[i].getA()+5);

}

for(int i=0; i<list.length; i++){
   list[i].displayA();
}

//java has rule  when you print the private values of object then address print if function not called
System.out.println(list[0].getA());
System.out.println(list[1].getA());
System.out.println(list[2].getA());
System.out.println(list[3].getA());
System.out.println(list[4].getA());

String list2[]=new String[3];
System.out.println(list2);
System.out.println(list2[0]);
System.out.println(list2[1]);

list2[0]="ABC";
//when you attach the objects with string then it will print the address of them
System.out.println(list2[0]+list[1]+list[2]);
System.out.println(list2[0]+list2[1]+list2[2]);

}
}