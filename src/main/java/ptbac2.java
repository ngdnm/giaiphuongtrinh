import java.util.Scanner;
public class ptbac2 {
    private static double delta;
    public static void main(String[] args) {
      double x1, x2;
      Scanner input = new Scanner(System.in);
      System.out.println("Nhap he so a : ");
      double a = input.nextDouble();
      System.out.println("Nhap he so b : ");
      double b = input.nextDouble();
      System.out.println("Nhap he so c : ");
      double c = input.nextDouble();
      System.out.println("Phuong trinh co dang: "+a+"x^2 + "+b+"x + "+c+" =0");
      delta = Math.pow(b,2)-4*a*c;
      if(delta < 0){
          System.out.println("Phuong trinh vo nghiem");
      }else if (delta ==0){
          x1 = -b/(2*a);
          System.out.println("Phuong trinh co 1 nghiem la x1 = x2 = "+x1);
      }else{
          x1 = (-b + Math.sqrt(delta))/(2*a);
          x2 = (-b - Math.sqrt(delta))/(2*a);
          System.out.println("Phuong trinh co 2 nghiem la x1 = "+ x1 + " va"+ " x2 = "+x2);
    }
   }  
}
