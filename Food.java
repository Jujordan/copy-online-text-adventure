public class Food extends Item {

    String size;

    public Food( String name, String description, String size ) {
        super( name, "FOOD", description, 0);
        int scoreValue = 0;
        switch ( size ) {
            case "SMALL":
                scoreValue = 5;
                break;
            case "MEDIUM":
                scoreValue = 50;
                break;
            case "LARGE":
                scoreValue = 100;
                break;
        }
        this.setScoreValue( scoreValue );
        this.size = size;
    }

    public String getSize( ) {
        return size;
    }

    public void setSize( String size ) {
        this.size = size;
    }

    public void eat( ) {
        getPlayer( ).heal( 1 );
        trash( );
    }

    public void trash( ) {
        if ( isInRoom( ) ) {
            getRoom( ).removeItem( name );
            itemRoom = null;
        }
        if ( isInInventory( ) ) {
            getPlayer( ).removeFoodFromInv( );
            itemHolder = null;
        }
        name = "TRASH";
        type = "TRASH";
    }
}
