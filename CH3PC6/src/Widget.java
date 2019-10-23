/**
 * Alex Harkleroad
 * Widget Factory
 * Programming III
 * 10/4/2019
 */
public class Widget {
    /**
     * Initialize fields
     */
    private int widgetsProduced;
    private final int widgetProduction = (widgetsProduced/160);
    
        /**
        * Widget Factory class constructor
        */
       public Widget(int w, int wp){
           widgetsProduced = w;
           }
       
       /**
       * Initialize methods
       */
       public void setwidgetsProduced(int w){
           widgetsProduced = w;
        }
       public int getwidgetProduction(){
           return widgetProduction;
        }
       public int getwidgetsProduced(){
           return widgetsProduced;
       }
        
}

