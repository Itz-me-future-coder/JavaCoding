import java.util.Scanner;
 class Details{
    String name;
    int mark1,mark2,mark3;
    double Average;
    Details(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the student Name:");
         name=sc.nextLine();
         System.out.println("Enter the marks:");
         mark1=sc.nextInt();
         mark2=sc.nextInt();
         mark3=sc.nextInt();
    } 
void calculateAverage(){  
        int total=mark1+mark2+mark3; 
       Average=total/3.0;
    }
   void display(){
        calculateAverage();
        System.out.println("\nStudent Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Average Marks: " + Average);

    if(Average>90){
            System.out.println("A");
        }else if(Average>=75){
            System.out.println("B");
        }else if(Average>=50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}
public class StudentGrade{
public static void main(String[]args){
    Details s1=new Details();
    s1.display();
}
}
