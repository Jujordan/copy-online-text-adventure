public class Item implements ItemInterface {

    String name;
    String type;
    String description;
    int scoreValue;
    Room itemRoom;
    Rat itemHolder;

    public Item( String name, String type, String description, int scoreValue) {
        this.name = name;
        this.type = type;
        this.scoreValue = scoreValue;
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getType( ) {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public String getDescription( ) {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public int getScoreValue( ) {
        return scoreValue;
    }

    public void setScoreValue( int scoreValue ) {
        this.scoreValue = scoreValue;
    }

    public boolean isInRoom( ) {
        return ( itemRoom != null );
    }

    public Room getRoom( ) {
        return itemRoom;
    }

    public void setRoom( Room itemRoom ) {
        this.itemRoom = itemRoom;
    }

    public boolean isInInventory( ) {
        return ( itemHolder != null );
    }

    public Rat getPlayer( ) {
        return itemHolder;
    }

    public void setPlayer( Rat itemHolder ) {
        this.itemHolder = itemHolder;
    }

}
