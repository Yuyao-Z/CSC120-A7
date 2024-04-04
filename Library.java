/**
File: Library.java
Author: Yuyao Zhu
Date: 2024-3-13
Description: Construct the class Library that extends from the class Building */

/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Map;

public class Library extends Building{
  private Hashtable<String, Boolean> collection;
  //Constructor of the class library
    public Library(int nFloors, String name, Hashtable<String, Boolean> collection,String address) { 
      super(name, address, nFloors);
      this.collection = collection;
      System.out.println("You have built a library: 📖");
    } //overloading method
    public Library(String address) {
      this.address = address; // Override address
  }

    /**Add one title to the collections of library
     * @param title: the book added to the collection
     */
    public void addTitle(String title){
      if (!collection.containsKey(title)){
        collection.put(title,true);    
        }
        else{
          throw new RuntimeException("Sorry, the book already existed in the library");}
        }
    /** Remove one book from the collection of library
     * @param title: the title that needs to be removed
     * @return the book that is removed from the collection 
     */
    public String removeTitle(String title){
      if (collection.containsKey(title)){
        collection.remove(title);
        return title + "has been successfully removed.";
      }
      else{
      throw new RuntimeException("Sorry, the book you are searching for is not found.");}
    }
    /** Change the status of a book since it is checked out
     * @param title: the title of the book that is checked out
     */
    public void checkOut(String title){
      if (collection.containsKey(title)){
        if (collection.get(title) == true){
          collection.put(title, false);
        }else{
        throw new RuntimeException("Sorry, the book you are looking for has already been checked out");}
      }else{
      throw new RuntimeException("Sorry, the book you are looking for is not found in this library");}
    }
    /** Change the status of the book from false to true since it is returned
     * @param title: the title of the book that is returned.
     */
    public void returnBook(String title){
      if (collection.containsKey(title)){
        if (collection.get(title) == false){
          collection.put(title, true);
        }else{
        throw new RuntimeException("Sorry, the book you are looking for has already been returned");}
      }else{
      throw new RuntimeException("Sorry, the book you are looking for is not found in this library");}
    }
  /** Check  whether a book is in the collection of the library
   * @param title: title of the book that is checked
   * @return whether the book is in the collection of the library
   */
  public boolean containsTitle(String title){
    if (collection.containsKey(title)) {
      return true;
    }
    return false;
  }
  /**Check whether a book is checked out in the collection of the library
   * @param title: title of book that is checked out 
   * @return whether the book is checked out or not
   */
  public boolean isAvailable(String title){
  if (collection.containsKey(title)){  
    return collection.get(title);}
  else{
    throw new RuntimeException("Sorry, we don't have this book at" + name);
  }
  }
  
  /*Prints out all the items in the collection of the library in a ways that can be easily read*/
  public void printCollection(){
  if (collection.size() > 0){
    for (Map.Entry<String, Boolean> entry : collection.entrySet()){
      String key = entry.getKey();
      Boolean value = entry.getValue();
      if (value == true){
        System.out.println(key + "is still availble at " + name);
      } 
      if (value == false){
        System.out.println(key + "is already checked out");}}}
  else{
    throw new RuntimeException("Sorry, there are no books in this library");}
  }
  public void goToFloor(int floorNum) {
      super.goToFloor(floorNum);}

  public void showOptions() {
    System.out.println("Available options at Library " + this.name + ":\n + addTitle() \n + removeTitle() \n + checkOut() \n + returnBook()\n + containsBook()\n + isAvailable()\n + printCollection()\n + goToFloor()\n + goUp()");
}
  public void goUp(){
    super.goUp();
    System.out.println("We have elevators actually.....");
  }
    public static void main(String[] args) {
      Hashtable<String, Boolean> c = new Hashtable<String, Boolean>();
      c.put("gone with wind", true);
      c.put("dsifo", true);
      c.put("eowfhoe", true);
      c.put("aufueiqpufh", false);
      Library Neilson = new Library(3,"Neilson",c,"diufiu");
      Neilson.addTitle("gone with water");
      Neilson.checkOut("gone with wind");
      Neilson.printCollection();
      Neilson.showOptions();
    }
  
  }