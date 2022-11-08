
package decoratot;

/**
 *
 * @author Dina
 */
 interface HotelRoom {
    
    public int reserve();

 
    
}
class SigleRoom implements HotelRoom {

   private int cost ;     

    public SigleRoom(int cost) {
        this.cost = cost;
    }
    
    @Override
    public int reserve() {
     
        return this.cost ; 

    }
   
}
  class Sweet implements HotelRoom {

   private int cost ;     

    public Sweet(int cost) {
        this.cost = cost;
    }

    @Override
    public int reserve() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
