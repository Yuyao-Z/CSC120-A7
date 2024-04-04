/**
File: House.java
Author: Yuyao Zhu
Date: 2024-3-13
Description: Construct the class House extends from class Building*/

/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  private boolean hasElevator;
  public int activeFloor = -1;
  //Constructor for the House class
  public House(ArrayList<String>residents, boolean hasDiningRoom,String name, String address, int nFloors, boolean hasElevator) {
    super(name, address, nFloors);
    this.residents = residents;
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
}
// overloading method
public House(String address) {
  this.address = address; // Override address
}

/**Return whether the house has dining room
 * @return whther the house has dining room
 */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  /**return the number of residents in a house
   * @return the number of objects in the list of residents
   */
  public int nResident(String person) {
    return residents.size();
}
/**add a resident to the house
 * @param name of the resident
 */
  public void moveIn(String name){
    if (residents.contains(name)){
      throw new RuntimeException("Sorry, the student already exist in the house.");
    }
    residents.add(name);
  }
  /** Remove a student from the house
   * @param<string> name of the student 
   * @return the name of the student removed
   */
  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      return name + "has been removed from the house";
    }
    throw new RuntimeException("Sorry, this student is not in this house");
  }
/**Check whther a student is a resident in this house by checking whether their names are in the list of residents
 * @param name of student
 * @return whether the student is in this house
 */
  public boolean isResident(String person){
    if (residents.contains(person)) {
      return true;
    }
    return false;
  }
  public void goToFloor(int floorNum) {
    if (hasElevator == true){
      super.goToFloor(floorNum);}
    else{
      throw new RuntimeException("The building does not have elevators, and you can use this method. ");
    }
  }
  public void showOptions() {
    System.out.println("Available options at House" + this.name + ":\n + hasDinningRoom() \n + nResident() \n + moveIn() \n + moveOut()\n + isResident(n)\n + goToFloor()\n + goUp()");
}//overloading method
  public void goUp(String name) {
    if (residents.contains(name)){
      this.goToFloor(this.activeFloor + 1);
    }
    else{
      throw new RuntimeException("Sorry, you are not a resident in this house. Please find any resident you know in this house to open the door for you.");
    }
  }
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    House house = new House(list,true,"Park House", "Elm St 134",4,true);
    house.moveIn("Mary");
    house.moveIn("April");
    house.moveOut("April");
    System.out.println(house.isResident("April"));
    house.goUp("Yuyao Zhu");
  }
 

}