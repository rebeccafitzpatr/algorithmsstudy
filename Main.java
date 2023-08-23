public class Main {
 

  public static void main(String[] args) { 
    int[] increasingArray = new int[]{1, 3, 4, 23, 25, 43, 55, 98, 109, 208, 333};

    int[] randomArray = new int[]{1, 7, 2, 8, 4, 5, 5, 4, 8, 2, 7, 5, 3, 7, 9, 1, 4, 7, 5, 7};
    System.out.println(binarySearch(increasingArray, 11, 23 ));

    System.out.println(binarySearch(increasingArray, 11, 333 ));
    System.out.println(binarySearch(increasingArray, 11, 1 ));
    
    
    //int[] sortedArray = selectionSort(randomArray);
    //int[] sortedArray = insertionSort(randomArray);

    Sort.quicksort(randomArray, 0, randomArray.length-1);

    for (int number : randomArray) {
      System.out.println(number);
    }
    
  }

  /**
   * given a target and array, return the index of the target
   * @param a
   * @param size
   * @param target
   * @return
   */
  public static int binarySearch (int[] a, int size, int target) {
    int left = 0;
    int right = size-1;

    while (left < right) {
      int q = ((left + right + 1)/2);
      
      if (target < a[q]) {
        right = q -1;
        
      }

      if (target >= a[q]) {
        left = q;
        
      }
    }

    if (a[right] == target) {
      return right;
    } else {
      return -1;
    }

  }

  /**
   * looks through an unsorted arrary and find the next smallest value, add it to the start of list
   * @return
   */
  public static int[] selectionSort(int[] a) {

    int size = a.length;

    for (int i = 0; i < size; i++) {
      int min = i;

      for (int j = i; j < size; j++) {
        if (a[j] < a[min]) {
          min = j;
        }
      }
      int temp = a[min];
      a[min] = a[i];
      a[i] = temp;

    }

    return a;

  }


  /**
   * takes the each value in the array, and adds it to the order
   * @param a
   * @return
   */
  public static int[] insertionSort(int[] a) {
    int size = a.length;
    for (int i = 2; i < size; i++) {
      int current = a[i];
      int count = i -1;
      while ((count > 0) && (a[count] > current)) {
        a[count + 1] = a[count];
        count --;
        a[count + 1] = current;
      }
    }

    return a;
  }


}