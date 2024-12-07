import java.lang.NullPointerException;

/**
 * This represents the behavior and actions of a player object.
 * This interface provides methods required for a player object.
 * @author Holden Kuempel, Justin Jordan, Ryan Tesch, Logan Franke
 * Class: CS1131, Lab: 02
 * @version 1.0
 */
public interface Player {

    /**
     * This calculates the current hitPoints of the Player object.
     * @return the number of hitPoints remaining.
     */
    int getHitPoints( );

    /**
     * This checks to see if the Player Object has 1 or more hitPoints.
     * @return true if player has 1 or more hitPoints.
     */
    boolean isAlive( );

    /**
     * This subtracts the hitPoints by damage.
     * @param damage the amount of damage taken by the Player Object.
     * @return isAlive.
     */
    boolean takeDamage( int damage );

    /**
     * This adds the hit points by healing.
     * @param healing the amount of healing received by the Player Object.
     */
    void heal( int healing );

    /**
     * This returns true if there is an object within the Player Object's Inventory.
     * @return true if invSize is 1 and false if 0.
     */
    boolean hasItem( );

    /**
     * This returns true if there is a food Item within the Player Object's Inventory.
     * @return true if there is a food item within player's inventory and false otherwise.
     */
    boolean hasFoodItem( );

    /**
     * This returns true if there is a nonfood Item within the Player Object's Inventory.
     * @return true if there is a nonfood item within player's inventory and false otherwise.
     */
    boolean hasNonFoodItem( );

    /**
     * This returns the Food Item within the Player Object's Inventory.
     * @return the Food Item within the Player Object's Inventory.
     * @throws NullPointerException if inventory[ 0 ] is null.
     */
    Item getFoodItem( ) throws NullPointerException;

    /**
     * This returns the Non-food Item within the Player Object's Inventory.
     * @return the Non-food Item within the Player Object's Inventory.
     * @throws NullPointerException if inventory[ 1 ] is null.
     */
    Item getNonFoodItem( ) throws NullPointerException;

    /**
     * This adds an Item to a Player Object's Inventory.
     * @param item is the Item being added to the Inventory.
     */
    void addToInv( Item item );

    /**
     * This removes the Food Item object from the Player Object's Inventory.
     * @return item the Food Item removed from the Inventory.
     * @throws NullPointerException if inventory[ 0 ] is null.
     */
    Item removeFoodFromInv( ) throws NullPointerException;

    /**
     * This removes the Non-food Item object from the Player Object's Inventory.
     * @return item the Non-food Item removed from the Inventory.
     * @throws NullPointerException if inventory[ 1 ] is null.
     */
    Item removeNonFoodFromInv( ) throws NullPointerException;

    /**
     * This returns the room that the Player Object is in.
     * @return the room the Player Object is in.
     */
    Room getRoom( );

    /**
     * This moves the Player Object to another room.
     * @param room the room to which the Player Object moves into.
     */
    void moveToRoom( Room room );
}