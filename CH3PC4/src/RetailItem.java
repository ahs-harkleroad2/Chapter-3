/**
 * Alex Harkleroad
 * Retail Item
 * Programming III
 * 10/1/2019
 */
public class RetailItem {
    /**
     * Initialize fields
     */
    private String description;
    private int unitsOnHand;
    private double price;
       
       /**
        * Retail Item class constructor
        */
       public RetailItem(String d, int u, double p){
           description = d;
           unitsOnHand = u;
           price = p;
           }

       /**
        * Initialize methods
        */
       public void setDescription(String d){
           description = d;
        }
       public void setunitsOnHand(int u){
           unitsOnHand = u;
        }
       public void setPrice(double p){
           price = p;
        }
       public String getDescription(){
           return description;
        }
       public int getunitsOnHand(){
           return unitsOnHand;
        }
       public double getPrice(){
           return price;
        }
       
}
