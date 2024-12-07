public class Rat implements Player {

    int hitPointMax = 2;
    int hitPoints;
    // inventory[ 0 ] should be a food Item and inventory[ 1 ] should be a non-food Item.
    Item[] inventory = new Item[ 2 ];
    Room playerRoom;

    public Rat( Room playerRoom ) {
        hitPoints = hitPointMax;
        this.playerRoom = playerRoom;
    }

    public int getHitPoints( ) {
        return hitPoints;
    }

    public int getHitPointMax( ) {
        return hitPointMax;
    }

    public boolean isAlive( ) {
        return ( hitPoints > 0 );
    }

    public boolean takeDamage( int damage ) {
        hitPoints -= damage;
        return isAlive( );
    }

    public void setHitPoints( int hitPoints ) {
        this.hitPoints = hitPoints;
    }

    public void heal( int healing ) {
        hitPoints += healing;
        if (hitPoints > hitPointMax) {
            setHitPoints( hitPointMax );
        }
    }

    public boolean hasItem( ) {
        return ( ( inventory[ 0 ] != null ) || ( inventory[ 1 ] != null ) );
    }

    public boolean hasFoodItem( ) {
        return ( inventory[ 0 ] != null );
    }

    public boolean hasNonFoodItem( ) {
        return ( inventory[ 1 ] != null );
    }

    public Food getFoodItem( ) {
        return ( Food ) inventory[ 0 ];
    }

    public Item getNonFoodItem( ) {
        return inventory[ 1 ];
    }

    public void addToInv( Item item ) {
        if ( item.getType( ).equals( "FOOD" ) ) {
            if ( hasFoodItem( ) ) {
                playerRoom.addItem( removeFoodFromInv( ) );
                // Drop food Item
            }
            inventory[ 0 ] = item;
        } else {
            if ( hasNonFoodItem( ) ) {
                playerRoom.addItem( removeNonFoodFromInv( ) );
            }
            inventory[ 1 ] = item;
        }
    }

    public Item removeFoodFromInv( ) {
        Item temp = inventory[ 0 ];
        inventory[ 0 ] = null;
        return temp;
    }

    public Item removeNonFoodFromInv( ) {
        Item temp = inventory[ 1 ];
        inventory[ 1 ] = null;
        return temp;
    }

    public Room getRoom( ) {
        return playerRoom;
    }

    public void moveToRoom( Room room ) {
        playerRoom = room;
    }

}
