import java.util.Scanner;

public class Runner1 {

  public static void main(String[] arg) {
   Scanner reader = new Scanner(System.in);
     try {
   Calku calc = new Calku();
  String exit = "no";
  while(!exit.equals("yes")) {
      System.out.println("Enter first num");
     String one = reader.next();
   System.out.println("Enter second num");
     String two = reader.next();
   calc.add(Integer.valueOf(one), Integer.valueOf(two));
   System.out.println("Result =>" + calc.getResult());
     calc.cleanResult();
    System.out.println("Exit : yes/no ");
   exit = reader.next();
   }
 } finally {
   reader.close();
 }
    } 
 }
