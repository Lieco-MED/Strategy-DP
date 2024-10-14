// Nom: Medlej Mohamad
//Github Repository: https://github.com/Lieco-MED/Strategy-DP

// Define the SortingStrategy interface
interface SortingStrategy {
 void sort(int[] array);
}

// Implement concrete sorting strategies
class BubbleSort implements SortingStrategy {
 public void sort(int[] array) {
 System.out.println("Sorting using Bubble Sort");
 // Implementation of Bubble Sort
 // ...
 }
}

class QuickSort implements SortingStrategy {
 public void sort(int[] array) {
 System.out.println("Sorting using Quick Sort");
 // Implementation of Quick Sort
 // ...
 }
}

// Context class that passes data to the selected sorting strategy
class Sorter {
 private SortingStrategy strategy;

 public Sorter(SortingStrategy strategy) {
    this.strategy = strategy;
 }
 public void setStrategy(SortingStrategy strategy) {
    this.strategy = strategy;
 }
 public void performSort(int[] array) {
    strategy.sort(array);
 }
}

public class StrategyPatternExample {
 public static void main(String[] args) {
 int[] numbers = {5, 1, 4, 2, 8};
 // Create sorting strategies
    SortingStrategy bubbleSort = new BubbleSort();
    SortingStrategy quickSort = new QuickSort();

 // Create a sorter with the BubbleSort strategy
    Sorter sorter = new Sorter(bubbleSort);

 // Perform a sort using the BubbleSort strategy
    sorter.performSort(numbers);

 // Switch to the QuickSort strategy and perform another sort
    sorter.setStrategy(quickSort);
    sorter.performSort(numbers);
 }
}
/*output: 
 Sorting using Bubble Sort
 Sorting using Quick Sort
 */

/* In this approach:
 *  the Strategy Design Pattern which is a behavioral pattern enables us to define a family of algorithms, 
 *  encapsulate each one, and make them interchangeable. 
 * In our example, the SortingStrategy interface defines the algorithm family, 
 *  and the BubbleSort and QuickSort classes are the interchangeable algorithms.
 * The Sorter class acts as the context that uses these algorithms we can say it acts as an intermediary step, 
 *  and the StrategyPatternExample class demonstrates how to use the Sorter class with different sorting strategies
 *  keeping the user's interface very easy to use while implementing polymorphism.
 * 
 * in this first implementation, the context gives the necessary data for the SortingStrategy for it for perform a sorting.
 * The Context passes the data to the Strategy operations as parameters.
 */

 
