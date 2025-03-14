  import java.util.Scanner;
//This code was basic understanding of constructor and method in java
class Personal{
    String name;
    int age;
    
Personal(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your name:");
     name=sc.nextLine();
    System.out.println("Enter your age:");
     age=sc.nextInt();
}

   void display(){
    System.out.println("Name:"+ name);
       
        System.out.println("Age:"+ age);
}
}

class Details{
    public static void main(String[]args){
      
      Personal obj=new Personal();
      obj.display();
    }
}
