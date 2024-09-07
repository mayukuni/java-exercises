package exercises;

import java.util.Scanner;

public class calcPOO {
   
   private int a;
   private int b;
   
   public int getA() {
       return a;
   }


   public void setA(int a) {
       this.a = a;
   }


   public int getB() {
       return b;
   }


   public void setB(int b) {
       this.b = b;
   }
   
   public calcPOO(int a, int b) {
       
       this.a = a;
       this.b = b;
       
   }
   

   public static void main(String[] args) {
       
       
       Scanner sc = new Scanner(System.in);
       
       int x;
       int y;
       
       System.out.println("Digite a");
       x = sc.nextInt();
       
       System.out.println("Digite b");
       y = sc.nextInt();
       
       calcPOO calc = new calcPOO(0,0);
       
       calc.setA(x);
       calc.setB(y);
       
       System.out.println("a=" + calc.getA());
       
       //System.out.println("a+b = " + (calc.a+calc.b));
       //System.out.println("a-b = " + (calc.a-calc.b));
       //System.out.println("a*b = " + (calc.a*calc.b));
       //System.out.println("a/b = " + (calc.a/calc.b));
       
       
   }

}
