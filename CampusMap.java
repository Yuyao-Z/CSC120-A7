import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Alumnae Gym", "83 Green St, Northampton, MA 01063"));
        myMap.addBuilding(new House("134 Elm St"));
        myMap.addBuilding(new Building("Art Museum", "20 Elm St, Northampton, MA, 01063"));
        myMap.addBuilding(new Cafe(1, 2,       3,4,"campus cafe", "100 Elm St, Northampton, MA 01063",2));
        myMap.addBuilding(new Library("7 Neilson Drive, Northampton, MA 01063"));
        ArrayList<String> residents = new ArrayList<String>();
        myMap.addBuilding(new House(residents, true, "Tyler House", "151-199 Green St, Northampton, MA 01063",3,false));
        myMap.addBuilding(new House(residents, true, "Cutter-Ziskind House", "10 Prospect St, Northampton, MA 01063", 4,true));
        myMap.addBuilding(new House(residents, true, "Chapin Hosue", "Northampton", 5, false));
        myMap.addBuilding(new House(residents, true, "King House", "180 Elm St, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new House("134 Elm St"));
        System.out.print("THISSSSSS ");
        System.out.println(myMap.buildings.get(4));
        System.out.println(myMap); 
    }
    
}
