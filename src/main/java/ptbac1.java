import java.util.Scanner;
public class ptbac1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhap he so a : ");
      int a = input.nextInt();
      System.out.println("Nhap he so b : ");
      int b = input.nextInt();
      if(a==0){
          if(b==0){
              System.out.println("Phuong trinh vo so nghiem");
          }else{
              System.out.println("Phuong trinh vo nghiem");
          } 
      }
      else System.out.println("Phuong trinh co nghiem x=  "+(-b/a));
    }
    
}
