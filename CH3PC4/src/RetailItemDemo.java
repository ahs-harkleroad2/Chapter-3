/**
 * Alex Harkleroad
 * Project
 * Programming III
 * Date
 */
public class RetailItemDemo {

    public static void main(String[] args) {
        //Creat Retail Item object one
        RetailItem retailItemOne = new RetailItem("Jacket", 12, 59.95);
        //Create Retail Item object two
        RetailItem retailItemTwo = new RetailItem("Designer Jeans", 40, 34.95);
        //Create Retail Item object three
        RetailItem retailItemThree = new RetailItem("Shirt", 20, 24.95);
        
        //Print Retail Item One
        System.out.println("Item #1: "+retailItemOne.getDescription()+
                " | Units on hand: "+retailItemOne.getunitsOnHand()+
                " | Price: $"+retailItemOne.getPrice());
        //Print Retail Item Two
        System.out.println("Item #2: "+retailItemTwo.getDescription()+
                " | Units on hand: "+retailItemTwo.getunitsOnHand()+
                " | Price: $"+retailItemTwo.getPrice());
        //Print Retail Item Three
        System.out.println("Item #3: "+retailItemThree.getDescription()+
                " | Units on hand: "+retailItemThree.getunitsOnHand()+
                " | Price: $"+retailItemThree.getPrice());
        
    }

}
