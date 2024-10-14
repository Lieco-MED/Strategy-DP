// Nom: Medlej Mohamad
//Github Repository: https://github.com/Lieco-MED/Strategy-DP


// Define the SortingStrategy interface
interface SortingStrategy {
    void sort();
   }

   // Implement concrete sorting strategies
   class BubbleSort implements SortingStrategy {
    private Sorter context;
    public BubbleSort(Sorter context) {
    this.context = context;
    }
    public void sort() {
    int[] array = context.getData();
    System.out.println("Sorting using Bubble Sort");
    // Implementation of Bubble Sort using context.getData()
    // ...
    }
   }


   class QuickSort implements SortingStrategy {
    private Sorter context;
    public QuickSort(Sorter context) {
    this.context = context;
    }

    public void sort() {
    int[] array = context.getData();
    System.out.println("Sorting using Quick Sort");
    // Implementation of Quick Sort using context.getData()
    // ...
    }
   }


   // Context class that retains data and passes itself to the selected sorting strategy
   class Sorter {
    private SortingStrategy strategy;
    private int[] data;

    public Sorter(int[] data) {
    this.data = data;
    }

    public void setStrategy(SortingStrategy strategy) {
    this.strategy = strategy;
    }
    public int[] getData() {
    return data;
    }
    public void performSort() {
    strategy.sort();
    }
   }


   public class StrategyPatternExample {
    public static void main(String[] args) {
    int[] numbers = {5, 1, 4, 2, 8};

    // Create a sorter with the BubbleSort strategy
    Sorter sorter = new Sorter(numbers);
    SortingStrategy bubbleSort = new BubbleSort(sorter);
    sorter.setStrategy(bubbleSort);
    // Perform a sort using the BubbleSort strategy
    sorter.performSort();
    // Switch to the QuickSort strategy and perform another sort
    SortingStrategy quickSort = new QuickSort(sorter);
    sorter.setStrategy(quickSort);
    sorter.performSort();
    }
   }
   
/*  Output:
    Sorting using Bubble Sort
    Sorting using Quick Sort
*/

/*
 In this approach, the SortingStrategy interface defines a sort method without any parameters. 
 The concrete sorting strategies (BubbleSort and QuickSort) request the data to be sorted from the Sorter class (context) using the getData method.
 
  this approach provides a more decoupled design between the context and the strategy, 
  but may lead to tighter coupling between the strategy and the context. 
  It is suitable for situations where the strategy needs to request data from the context, 
  but may not be the best choice for situations where the data is already available to the strategy.

  In this Second implementation, the strategy has access to the context class, and can get the data from it, using the getData Method
 */