/**
 * This represents the behaviors and interactions of Rooms.
 * This interface has methods essential for Rooms.
 * @author Holden Kuempel, Ryan Tesch, Logan Franke, Justin Jordan
 * Class: CS1131, Lab: L02
 * @version 1.0.
 */
public interface Location {

    /**
     * This returns the name of the room.
     * @return the name of the room
     */
    String getRoomName( );

    /**
     * This updates the name of the room.
     * @param name the new name of the room.
     */
    void setRoomName( String name );

    /**
     * This returns the description of the room
     * @return the description of the room
     */
    String getRoomDescription( );

    /**
     * This updates the description of the room.
     * @param description the new description of the room.
     */
    void setRoomDescription( String description );

    /**
     * This checks to see if a player is within this Room.
     * @return true if a player is within the room and false otherwise.
     */
    boolean isOccupiedByPlayer( );

    /**
     * This returns the Player Object within the Room
     * @return the player Object within the Room
     * @throws NullPointerException if there is no Player Object within the Room
     */
    Player getPlayer( ) throws NullPointerException;

    /**
     * This updates the Player Object within the Room.
     * @param player is the new Player Object within the Room.
     */
    void setPlayer( Player player );

    /**
     * This checks to see if the Room contains any Items.
     * @return true if at least one Item is present and false otherwise
     */
    boolean containsItems( );

    /**
     * This returns the number of Items within the Room.
     * @return the number of Items within the Room
     */
    int numberOfItems( );

    /**
     * This returns the first Item within the Room.
     * @return returns the first Item within the Room.
     * @throws NullPointerException if there are no Items within the Room.
     */
    Item getItem( ) throws NullPointerException;

    /**
     * This returns the first Item within the Room, with the same name.
     * @param nameOfItem the nameOfTheItem you wish to get from the Room.
     * @return the Item that has the specified name.
     * @throws NullPointerException if no Item is within the Room.
     */
    Item getItem( String nameOfItem ) throws NullPointerException;

    /**
     * This removes the first Item within the Room, with the same name.
     * @param nameOfItem the nameOfTheItem you wish to remove from the Room.
     * @throws NullPointerException if no Item is within the Room.
     */
    void removeItem( String nameOfItem ) throws NullPointerException;

    /**
     * This adds an Item to the Room.
     * @param item the item added to the Room.
     */
    void addItem( Item item );

    /**
     * This checks to see if there is a Room to the north of this one.
     * @return true if there is a Room north of this one and false otherwise.
     */
    boolean canGoNorth( );

    /**
     * This returns the room to the North of this one.
     * @return the room to the North of this one.
     * @throws NullPointerException if there is no room North of this one.
     */
    Room getNorthernRoom( ) throws NullPointerException;

    /**
     * This sets the value of the room to the north of this one.
     * @param room the room that is going to the north of this one.
     */
    void setNorthernRoom( Room room );

    /**
     * This checks to see if a Room is to the East of this one.
     * @return true if a Room is to the East of this one and false otherwise
     */
    boolean canGoEast( );

    /**
     * This returns the room that is to the East of this one
     * @return the room that is to the East of this one
     * @throws NullPointerException if there is no room to the East of this one.
     */
    Room getEasternRoom( ) throws NullPointerException;

    /**
     * This sets the value of the room to the East of this one.
     * @param room the room that is going to be to the East of this one.
     */
    void setEasternRoom( Room room );

    /**
     * This checks to see if there is a Room to the South of this one.
     * @return true if there is a Room to the South of this one and false otherwise.
     */
    boolean canGoSouth( );

    /**
     * This returns the Room that is to the South of this one.
     * @return the Room that is to the South of this one.
     * @throws NullPointerException if there is no Room to the south of this one.
     */
    Room getSouthernRoom( ) throws NullPointerException;

    /**
     * This sets the value of the Room to the South of this one.
     * @param room the Room that is going to be to the South of this one.
     */
    void setSouthernRoom( Room room );

    /**
     * This checks to see if there is a Room to the West of this one.
     * @return true if there is a Room to the West of this one and false otherwise.
     */
    boolean canGoWest( );

    /**
     * This returns the Room that is to the West of this one.
     * @return the Room that is to the West of this one.
     * @throws NullPointerException if there is no Room to the West of this one.
     */
    Room getWesternRoom( ) throws NullPointerException;

    /**
     * This sets the value of the Room to the West of this one.
     * @param room the Room that is going to be to the West of this one.
     */
    void setWesternRoom( Room room);
}
