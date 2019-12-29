
package poslajumlysia;

        
import java.util.Scanner;

public class PosLajuMlysia {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
       
        int cust;
        int custChoice;
        
        System.out.printf("WELCOME TO POSLAJU\n");  
        System.out.println("--------------------------------  "); 

        do{
       
        System.out.printf("\n\n1. Next Day Delivery\n");
        System.out.printf("2. Same Day Delivery\n");
        System.out.printf("3. Prepaid Box and Envelope\n");
        System.out.printf("4. Pos Ekspres\n");
        System.out.printf("5. Exit\n\n");
        
        System.out.println("**Enter your selection  ");
        custChoice = scan.nextInt();
        switch (custChoice){

            case 1 : NextDayDelivery(); 
            break;
            
            case 2 : SameDayDelivery(); 
            break;
            
            case 3 : PrepaidBoxAndEnvelope(); 
            break;
            
            case 4 : PosEkspress();
            break;
            
            case 5 : 
                System.out.println("YOU HAVE PRESS EXIT BUTTON");
                System.out.println("THANK YOU FOR USING OUR SERVICES"); break;
            default : System.out.println("Please enter 1-5 only !!");}
        
        }while (custChoice !=5);
    }  
    
public static double NextDayDelivery(){
    
  double charge1 =0, weight=0;
  int zone, customer; 
  float totalcharge = 0;
     
  Scanner scan = new Scanner(System.in);

    System.out.println("\nYOU HAVE CHOOSEN NEXT DAY DELIVERY");
                   
     System.out.printf("\n(1)NEXT DAY DELIVERY          ");
     System.out.printf("\n-------------------------------------------------------------------------------- ");
     System.out.printf("\n                 DOCUMENT (below 2kg)      |         PARCEL (above 2kg)          \n");
     System.out.printf("--------------------------------------------------------------------------------\n");
     System.out.printf("\t first 500g  | Subsequent 250gm    |  2.0001 - 2.5kg | Subsequent 500gm \n");
     System.out.printf("--------------------------------------------------------------------------------\n");
     System.out.printf(" zone 1 |    4.90     |        0.80        |      10.50      |        0.50     \n");
     System.out.printf(" zone 2 |    5.40     |        1.00        |      16.00      |        2.00       \n");
     System.out.printf(" zone 3 |    6.90     |        1.50        |      21.00      |        3.00      \n");
     System.out.printf(" zone 4 |    7.90     |        1.50        |      26.00      |        3.50       \n");
     System.out.printf(" zone 5 |    4.90     |        2.00        |      31.00      |        4.00       \n");
     System.out.printf("--------------------------------------------------------------------------------\n "); 

     System.out.printf("Enter your zone         : ");
     zone = scan.nextInt();
     
    switch (zone){
  
      case 1:
             System.out.print("Please enter your weight : ");
                    weight = scan.nextInt();
                   if (weight <=2000){
                   if (weight <= 2000) {charge1 = 4.90 + (weight - 500) / 250 * 0.80; }
                   if (weight <= 500) {charge1 = 4.90;}
                    }
                   if (weight > 2000){
                   if (weight <= 2500) {charge1 = 10.50;}
                   if (weight > 2500) {charge1 = 10.50 + (weight - 2500) / 500 * 0.50;}
          }
               break;
      case 2 :
           System.out.print("Please enter your weight : ");
                    weight = scan.nextInt();
                    if (weight <= 2000) {
                    if (weight <= 2000) {charge1 = 5.40 + (weight - 500) / 250 * 1.00; }
                    if (weight <= 500) {charge1 = 5.40;}
                }
                if (weight > 2000) {
                    if (weight <= 2500) {charge1 = 16.00; }
                    if (weight > 2500) { charge1 = 16.00 + (weight - 2500) / 500 * 2.00; }
                    }
               break;
      case 3:
           System.out.print("Please enter your weight : ");
                    weight = scan.nextInt();
                    if (weight <= 2000) {
                    if (weight <= 2000) { charge1 = 6.90 + (weight - 500) / 250 * 1.50;}
                    if (weight <= 500) {charge1 = 6.90;}
                    }
                    if (weight > 2000) { if (weight <= 2500) { charge1 = 21.00; }
                    if (weight > 2500) {charge1 = 21.00 + (weight - 2500) / 500 * 3.00; }
                    }
                break;
      case 4:
           System.out.print("Please enter your weight : ");
                    weight = scan.nextInt();
                    if (weight <= 2000) {
                    if (weight <= 2000) { charge1 = 7.40 + (weight - 500) / 250 * 1.50;}
                    if (weight <= 500) {charge1 = 7.40; }
                    }
                    if (weight > 2000) {
                    if (weight <= 2500) {charge1 = 26.00;}
                    if (weight > 2500) {charge1 = 26.00 + (weight - 2500) / 500 * 3.50;}
                    }
                break;
      case 5:
           System.out.print("Please enter your weight : ");
                    weight = scan.nextInt();
                    if (weight <= 2000) {
                    if (weight <= 2000) { charge1 = 7.90 + (weight - 500) / 250 * 2.00;}
                    if (weight <= 500) {charge1 = 7.90; }
                     }
                    if (weight > 2000) {
                    if (weight <= 2500) { charge1 = 31.00;
                    }
                    if (weight > 2500) {charge1 = 31.00 + (weight - 2500) / 500 * 4.00; }
                    }
                break;
}
    
      System.out.printf("YOUR TOTAL FOR NEXT DAY DELIVERY IS : RM");
         System.out.printf("%.2f", charge1);
        return 0;
    }

  public static void SameDayDelivery(){

      double total = 0;
      int town=0;
      double price = 0;
      int weight = 0;

     System.out.println("\nYOU HAVE CHOOSEN SAME DAY DELIVERY");
     System.out.printf("\n\n(2)SAME DAY DELIVERY");
     System.out.printf("\n\t------------------------------------------------------------------------------------------");
     System.out.printf("\n\tWEIGHT                  LOCAL TOWN\t\t\tCROSS TOWN     \n");
     System.out.printf("\t------------------------------------------------------------------------------------------\n ");
     System.out.printf("\t                DOMESTIC CHARGE  | SURCHARGE | TOTAL | DOMESTIC CHARGE | SURCHARGE | TOTAL |\n");
     System.out.printf("\t below 500g |\t    4.90       |    6.00   | 10.90 |      5.40       |   7.50   |  12.90 |\n ");
     System.out.printf("\t 500g - 750g|\t    4.90       |    6.00   | 10.90 |      5.40       |   7.50   |  12.90 |\n");
     System.out.printf("\t 750g - 1kg |\t    5.70       |    6.00   | 11.90 |      6.40       |   7.50   |  13.90 |\n");
     System.out.printf(" \t below 500g |\t    6.50       |    6.00   | 12.50 |      7.40       |   7.50   |  14.90 |\n");
     System.out.printf(" \t------------------------------------------------------------------------------------------ \n");
         
    Scanner scan = new Scanner(System.in);
   System.out.println("Where do you want to delivery?");
   System.out.println("----------------");
   System.out.println("1. Local Town");
   System.out.println("2. Cross Town");
   System.out.println("----------------");
  
  town = scan.nextInt();
  
switch(town){
    case 1 : 
System.out.println("Please enter your weight(gm) :");
 weight = scan.nextInt();
        double doCharge = 4.90;
        double surcharge = 6.00;

if (weight > 0 && weight < 500){
            price = doCharge + surcharge;
        }
        else if (weight >= 500 && weight < 750){
            price = (doCharge+0.8) + surcharge;
        }
        else if (weight >= 750 && weight <= 1000){
            price = (doCharge+1.6) + surcharge;
        }
        else {
            System.out.println("you enter invalid weight!");    
        }
        total+=price;
case 2 :
   if (weight > 0 && weight < 500){price = 5.40 + 7.50;}
        else if (weight >= 500 && weight < 750){price = (5.40+1) + 7.50;}
        else if (weight >= 750 && weight <= 1000){price = (5.40+2) + 7.50;}
        else {System.out.println("invalid weight!!");}
        System.out.printf("Total for Same Day Delivery: RM"+ "%.2f\n", total);
        total += price;
}
   
  }
    
  public static void PrepaidBoxAndEnvelope(){
       int i=0, type, weight;
        int zone;
        String reservation;
        do {
            i+=1;
            Scanner scan = new Scanner(System.in);
            System.out.print("\ncustomer " +i);
            System.out.print("Enter your packages type : ");
            System.out.println("\n1.Envelope S"+"\n2.Envelope L"+"\n3.Prepaid Box S"+"\n4.Prepaid Box M"+"\n5.Prepaid Box L");
            System.out.print("Your type is: ");
            type = scan.nextInt ();
            System.out.print("enter your item weight (in gram): ");
            weight = scan.nextInt();

  if (weight<=500){
                System.out.println("Price is RM7.31");
            }
            else if(weight>500 && weight<1000){ System.out.println("Price is RM10.49"); }
            else if(weight>1000 && weight<2000){System.out.println("Price is RM13.78"); }
            else if(weight>2000 && weight<5000){System.out.println("Price is RM21.20");}
            else if(weight>5000 && weight<10000){System.out.println("Price is RM31.80");}
            else{   System.out.println("Error input!");
                    System.out.println("Item can not over than 10 kg");}
                    System.out.print("Do you want to continue? (Yes or No): ");
                   reservation = scan.next();}
            while (reservation.equalsIgnoreCase ("yes"));
 }

  public static void PosEkspress(){
  
  int i=0, type, weight;
        String zone;
        int tebal;
        String reservation;
        do {
            i+=1;
            Scanner scan = new Scanner(System.in);
            System.out.print("\ncustomer " +i);
            System.out.print("\nEnter your zone: ");
            zone = scan.next();
            System.out.print("Enter your packages type : ");
            System.out.println("\n1.LG"+"\n2.LE (C5)"+"\n3.LD (B4)"+"\n4.LK");
            System.out.print("Your type is: ");
            type = scan.nextInt ();
            System.out.print("enter your item weight (in g): ");
            weight = scan.nextInt();
            System.out.print("enter your item thickness (in mm): ");
            tebal = scan.nextInt();

            if (weight<=100){
                if(tebal<=3) {System.out.println("Price is RM3.18");}
                else if(tebal>3 && tebal<=5){ System.out.println("Price is RM3.71");}
                else if(tebal>5 && tebal<=10){System.out.println("Price is RM4.77");}
                else if(tebal>10 && tebal<=25){ System.out.println("Price is RM7.42");}
                else{System.out.println("Thickness max is only 25 mm"); }
            }
                else if(weight>100 && weight<=250){
                if(tebal<=3) { System.out.println("Price is RM3.18");}
                else if(tebal>3 && tebal<=5){System.out.println("Price is RM3.71"); }
                else if(tebal>5 && tebal<=10){ System.out.println("Price is RM4.77");}
                else if(tebal>10 && tebal<=25){System.out.println("Price is RM7.42"); }
                else{ System.out.println("Thickness max is only 25 mm"); }
            }

            else if(weight>250 && weight<=500){
                if(tebal<=3) {
                System.out.println("Price is RM3.18");}
                else if(tebal>3 && tebal<=5){System.out.println("Price is RM3.71");}
                else if(tebal>5 && tebal<=10){ System.out.println("Price is RM4.77");  }
                else if(tebal>10 && tebal<=25){System.out.println("Price is RM7.42"); }
                else{System.out.println("Thickness max is only 25 mm"); }
            }

            else if(weight>500 && weight<1000){
            if(tebal<=3) { System.out.println("Price is RM3.18"); }
            else if(tebal>3 && tebal<=5){System.out.println("Price is RM3.71"); }
            else if(tebal>5 && tebal<=10){System.out.println("Price is RM4.77"); }
            else if(tebal>10 && tebal<=25){System.out.println("Price is RM7.42");
            }
            else{System.out.println("Thickness max is only 25 mm"); }
        }
            else{ System.out.println("Error input!");
            
            System.out.println("Item can not over than 1 kg (1000 g)");
            }
            System.out.print("Do you want to continue? (Yes or No): ");
            reservation = scan.next();
        } while (reservation.equalsIgnoreCase ("yes"));

  } 

}
    