package control;

import model.Location;
import model.Map;
import model.Point;
import exceptions.MapControlException;

public class MapControl {

    public MapControl() {

    }

    public static Map createMap()
            throws MapControlException {
        //Create Map Object and assign Values to it
        Map map = new Map();
        int noOfRows = 5;
        int noOfColumns = 5;

        //Create a 2D array of locations and assign array to locations
        Location[][] locations = new Location[noOfRows][noOfColumns];

        locations[0][0] = new Location("U", "Undeveloped Land", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[0][1] = new Location("U", "Undeveloped Land", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[0][2] = new Location("F", "Fields", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[0][3] = new Location("V", "Village", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[0][4] = new Location("R", "River", "Description", new String[]{"Tip1", "Tip2", "Tip3"});

        locations[1][0] = new Location("U", "Undeveloped Land", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[1][1] = new Location("R", "River", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[1][2] = new Location("R", "River", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[1][3] = new Location("R", "River", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[1][4] = new Location("B", "Name of location", "Description", new String[]{"Tip1", "Tip2", "Tip3"});

        locations[2][0] = new Location("R", "River", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[2][1] = new Location("T", "Temple", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[2][2] = new Location("C", "Courthouse", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[2][3] = new Location("W", "Watchtower", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[2][4] = new Location("B", "Borderline", "Description", new String[]{"Tip1", "Tip2", "Tip3"});

        locations[3][0] = new Location("F", "Fields", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[3][1] = new Location("F", "Fields", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[3][2] = new Location("F", "Fields", "Where we store all of our inventory", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[3][3] = new Location("V", "Village", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[3][4] = new Location("B", "Borderline", "Description", new String[]{"Tip1", "Tip2", "Tip3"});

        locations[4][0] = new Location("F", "Fields", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[4][1] = new Location("F", "Fields", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[4][2] = new Location("F", "Fields", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[4][3] = new Location("V", "Village", "Description", new String[]{"Tip1", "Tip2", "Tip3"});
        locations[4][4] = new Location("S", "The Storehouse", "Description", new String[]{"Tip1", "Tip2", "Tip3"});

        map.setLocations(locations);
        Point point = new Point(4, 4);
        map.setCurrentLocation(point);
        return map;
    }

}
