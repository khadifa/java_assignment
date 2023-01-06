
public class MyOwnAutoShop {
   
           public static void main(String[] args) {

 Sedan mySedan = new Sedan(100, 5000, "pink", 43);
 Ford f1 = new Ford (480,6454.0,"red",2011, 50);
 Ford f2 = new Ford (1435,50500.0,"Pink",2000, 35);
 Car myCar = new Car (554, 5000.0, "white"); 

 System.out.println("Sedan Sale Price" + mySedan.getSalePrice());
 System.out.println("Fordcar 1 Sale Price" + f1.getSalePrice());
 System.out.println("Fordcar 2 Sale Price" + f2.getSalePrice());
 System.out.println("Car Sale Price" + myCar.getSalePrice());
 }
}