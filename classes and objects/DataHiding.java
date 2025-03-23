// DATA HIDING : It means hiding the sensitive informations or not necessary information and showing only required information.

// It is three types : 
//       a. public 
//       b. private
//       c. protected
// a. public : if we don't use any access modifier then the default is public for any method or any property
// b. private : if we make any property(variables) private then we can't access that property outside the class in which we have applied the
//              private modifier.
//              -for using that property use it into a public method and call that public method outside the class then it is accessable
//              -for this we use two methods called getters and setters
//              -getters are used to get the values of the private members 

import java.util.*;

public class DataHiding {

      private int length;
      private int breadth;

      public int getLength(){
            return length;
      }
      public void setLenght(int l){
            length = l;
      }      
      public int getBreadth()
      {
            return breadth;
      }
      public void setBreadth(int b)
      {
            breadth = b;
      }
}
class JustClass{
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            DataHiding dh = new DataHiding();
            System.out.println("set the length of the rectangle : ");
            int n = sc.nextInt();
            dh.setLenght(n);
            System.out.println("entetr the breadth of the rectangle : ");
            int m = sc.nextInt();
            dh.setBreadth(m);

            System.out.println("the length of the rectangle : "+dh.getLength());
            System.out.println("the breadth of the rectangle is : "+dh.getBreadth());
            sc.close();
      }
}