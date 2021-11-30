package Day04_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
    	 /* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
    
     
       Scanner scan=new Scanner(System.in);
       
       System.out.print("bir string giriniz : ");
       
       
       String str=scan.nextLine();
       
       ilkIkisiz(str);
       
       
 }
 public static void ilkIkisiz(String str) {
     
     if (str.startsWith("gh")) {
         System.out.println(str);
         
     }else if (str.startsWith("g")) {
         System.out.println(str.charAt(0)+str.substring(2));
         
     } else if (str.charAt(1)=='h') {
         System.out.println(str.substring(1));
         
     }else {
         System.out.println(str.substring(2));
     }
     
     

    }
}
