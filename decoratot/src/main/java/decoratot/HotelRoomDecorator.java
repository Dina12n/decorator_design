/*

/**
 *
 * @author Dina
 */
package decoratot;

 abstract class HotelRoomDecorator implements HotelRoom {
    HotelRoom hotelRoom ;  
    public int reserve (){
        return 0;
 

}
   public HotelRoomDecorator(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
    
}

class VIPDinnerDecorator extends HotelRoomDecorator {

    int cost ; 

    public VIPDinnerDecorator(int cost ,HotelRoom hotelRoom) {
        super(hotelRoom);
        this.cost = cost;
    }
   
         @Override
    public int reserve() {
     return hotelRoom.reserve()+cost ;
    }
    }


