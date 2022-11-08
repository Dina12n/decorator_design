

package decoratot;

/**
 *
 * @author Dina
 */

public class Decoratot {

  public static void main(String[] args) {
SigleRoom s = new SigleRoom(50) ; 
    System.out.println("cost of reversing room : "+ s.reserve()); 
    VIPDinnerDecorator sWithdinner = new VIPDinnerDecorator(40 , s) ;
    System.out.println("cost of reversing room : "+ sWithdinner.reserve()); 
    
  }}