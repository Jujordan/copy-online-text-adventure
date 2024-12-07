import java.util.ArrayList;

public class Room implements Location{

    String name;
    String description;
    Player player;
    ArrayList<Item> inv = new ArrayList();
    Room northernRoom;
    Room easternRoom;
    Room southernRoom;
    Room westernRoom;

    public Room( String name, String description ) {
        this.name = name;
        this.description = description;
    }

    public String getRoomName( ) {
        return this.name;
    }

    public void setRoomName( String name ) {
        this.name = name;
    }

    public String getRoomDescription( ) {
        return description;
    }

    public void setRoomDescription( String description ) {
        this.description = description;
    }

    public boolean isOccupiedByPlayer( ) {
        return (player !=null );
    }

    public Player getPlayer( ) {
	return player;
    }

    public void setPlayer( Player player ) {
        this.player = player;
    }

    public boolean containsItems( ) {
        return ( inv.size( ) > 0 );
    }

    public boolean containsItem( Item item) {
        if ( !( this.containsItems( ) ) ) {
            return false;
        } else {
            for ( Item i : inv ) {
                if ( i.getName( ).equals( item.getName( ) ) ) {
                    return true;
                }
            }
        }
        return false;
    }

    public int numberOfItems( ) {
        return ( inv.size( ) );
    }

    public Item getItem( ) {
        return inv.get( 0 );
    }

    public Item getItem( String name ) throws NullPointerException {
	Item returnObj = null;
	try {
		for ( int i = 0; i < inv.size( ); i++ ) {
			if ( inv.get( i ).getName( ).equals( name ) ) {
				returnObj = inv.get( i );
			}
		}
	} catch ( NullPointerException e ) {
		System.out.println( e );
		e.printStackTrace( );
	}
        return returnObj;
    }

    public ArrayList<Item> getAllItems( ) {
        return inv;
    }

    public void removeItem( String nameOfItem ) {
        for (int i = 0; i < inv.size( ); i++ ) {
            if ( inv.get( i ).getName( ).equals( nameOfItem ) ) {
                inv.remove( i );
            }
        }
    }

    public void addItem( Item item ) {
        inv.add( item );
    }

    public boolean canGoNorth( ) {
        return (northernRoom != null);
    }

    public Room getNorthernRoom( ) {
        return northernRoom;
    }

    public void setNorthernRoom( Room northernRoom ) {
        this.northernRoom = northernRoom;
    }

    public boolean canGoEast( ) {
        return (easternRoom != null);
    }

    public Room getEasternRoom( ) {
        return easternRoom;
    }

    public void setEasternRoom( Room easternRoom ) {
        this.easternRoom = easternRoom;
    }

    public boolean canGoSouth( ) {
        return (southernRoom != null);
    }

    public Room getSouthernRoom( ) {
        return southernRoom;
    }

    public void setSouthernRoom( Room southernRoom ) {
        this.southernRoom = southernRoom;
    }

    public boolean canGoWest( ) {
        return (westernRoom != null);
    }

    public Room getWesternRoom( ) {
        return westernRoom;
    }

    public void setWesternRoom( Room westernRoom ) {
        this.westernRoom = westernRoom;
    }

}
