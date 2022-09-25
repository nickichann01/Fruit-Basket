import java.util.*;

public class fruitbasket {
  //Initialize Scanner
  Scanner nic = new Scanner(System.in);

  //Stack
  Stack fruits = new Stack(); 

  public static void main(String[] args) {
    fruitbasket fruit = new fruitbasket();
    fruit.AskUser();
    fruit.EatFruits();
  }

  // Ask User about the fruits
  public void AskUser(){
    System.out.println(" ");
    System.out.println("Catch and eat any of fruits: ('apple', 'orrange', 'mango', 'guava')  "  );
    System.out.println(" ");
    System.out.print("How many fruits would you like to catch?  ");
    int num_fruits = nic.nextInt();
    System.out.println(" ");
    System.out.print("Choose a fruit to catch. Press A, O, M, or G. ");
    System.out.println(" ");

    // Ask fruits
    for(int x = 0; x < num_fruits; x++){
        System.out.print("Fruit " + (x + 1) + " of " + num_fruits + ": ");
        char initial = nic.next().charAt(0);
        if(initial == 'a'){
          fruits.push("Apple");
        } else if (initial == 'o'){
          fruits.push("Orange");
        } else if (initial == 'm') {
          fruits.push("Mango");
        } else if (initial == 'g') {
          fruits.push("Guava");
        } else {
          System.out.println("Run a again");
          System.out.println(" ");
        }
    }
  }

  // Eat fruits
  public void EatFruits(){
    System.out.println(" ");
    System.out.print("Your basket now has: " + fruits);
    System.out.println(" ");
    while(!fruits.isEmpty()){
      System.out.println(" ");
      System.out.print("Press E to eat a fruit: ");
      char eat = nic.next().charAt(0); 
      if(eat == 'e'){
        fruits.pop();
        System.out.println(" ");

        if(fruits.size() != 0){
          System.out.print("Your basket now has: " + fruits);
        }
      }
    }
    System.out.print("No More Fruits");
  }
}
