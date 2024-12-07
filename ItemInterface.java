import java.lang.NullPointerException;

/**
 * This represents the behavior and interactions of an Item.
 * This interface contains methods required for an Item Class.
 * @author Holden Kuempel, Justin Jordan, Ryan Tesch, Logan Franke.
 * Class: CS1131, Lab: L02.
 * @version 1.0.
 */
public interface ItemInterface {

    /**
     * This returns the name of the Item Object.
     * @return name.
     */
    String getName( );

    /**
     * This sets the name of the Item Object.
     * @param name is the new name of the Item Object.
     */
    void setName( String name );

    /**
     * This returns the type of Item.
     * @return this returns the type of item
     */
    String getType( );

    /**
     * This sets the type of Item.
     * @param type is the new type of the Item.
     */
    void setType( String type );

    /**
     * This checks to see if the Item Object is in the room.
     * @return true if is in a room, false if not in a room.
     */
    boolean isInRoom( );

    /**
     * This returns the room value of the Item Object.
     * @return the room the Item Object is in.
     * @throws NullPointerException if the Item Object was not in the room.
     */
    Room getRoom( ) throws NullPointerException;

    /**
     * This sets the new room value of the Item Object.
     * @param room is the new room of the Item Object.
     */
    void setRoom( Room room );

    /**
     * This checks to see if the Item Object is within a Player's inventory.
     * @return true if it is in a player's inventory and false otherwise.
     */
    boolean isInInventory( );

    /**
     * This returns the Player Object that holds the Item Object.
     * @return the Rat Object that is holding the Item Object.
     * @throws NullPointerException if it is not within a Player's Inventory.
     */
    Rat getPlayer( ) throws NullPointerException;

    /**
     * This sets the value of holdingPlayer.
     * @param player the new value of holdingPlayer.
     */
    void setPlayer( Rat player );
}
