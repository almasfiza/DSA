import java.util.*;
class Arraylist {
  public static void main(String[] args) {
    //working with arrays and ArrayLists

    //initialising and array
    int ar[] = new int [10];
    //gives the position of the array
    System.out.println(ar);
    //to print an array either iterate through the elements or print as string.
    for(int i = 0 ; i < ar.length; i++){
      System.out.print(ar[i]+" ");
    }
    System.out.println();
    System.out.println(Arrays.toString(ar));
    //asList also prints the address
    System.out.println(Arrays.asList(ar));
    //another way of iterating
    for(int ele: ar){
      System.out.print(ele+" ");
    }
    System.out.println();

    //length of the array
    System.out.println("Find the length of the array using ar.length.");
    System.out.println(ar.length);

    //ArrayList - resizable array in java.utils.
    ArrayList <Integer> a = new ArrayList <Integer> ();
    //add elements to arraylist
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(8);
    a.add(5);
    //display
    System.out.println("After adding elements to the arraylist using a.add().");
    System.out.println(a);
    //access an item
    System.out.println("Accessing the element at the index 1 by using a.get(1).");
    System.out.println(a.get(1));
    //modify an element
    System.out.println("Modifying the element at index position 2 by a.set(index,newele).");
    a.set(2,10);
    System.out.println(a);
    //remove an item
    System.out.println("Removing an element at an index using a.remove(index).");
    a.remove(0);
    System.out.println(a);
    //check if arraylist contains and element
    System.out.println("Checking if an element exists by a.contains(ele).");
    System.out.println(a.contains(5));
    //size
    System.out.println("a.size(): "+a.size());
   //loop through the arraylist
    System.out.println("Looping through the arraylist.");
    for(int i = 0 ; i < a.size(); i++ ){
      System.out.println("a.get("+i+"): "+a.get(i));
    }
    //sort an arraylist
    Collections.sort(a);
    System.out.println("Collections.sort(a): "+a);
    //check if empty
    System.out.println("a.isEmpty(): "+a.isEmpty());
    //get index position
    System.out.println("a.indexOf(2): "+a.indexOf(2));
    System.out.println("a.lastIndexOf(5): "+a.lastIndexOf(5));
    //convert to array
    System.out.println("Converting arraylist to array using a.toArray(arr).");
    Integer[] array = new Integer[a.size()];
    array = a.toArray(array);
    System.out.println(Arrays.toString(array));
    //remove all elements of array
    System.out.println("Removing all elements of the array using clear().");
    a.clear();
    System.out.println(a);
  }
}
