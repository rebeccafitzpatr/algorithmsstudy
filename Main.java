public class Main {
 

  public static void main(String[] args) { 
    int[] increasingArray= new int[]{1, 3, 4, 23, 25, 43, 55, 98, 109, 208, 333};

    System.out.println(binarySearch(increasingArray, 11, 23 ));

    System.out.println(binarySearch(increasingArray, 11, 333 ));
    System.out.println(binarySearch(increasingArray, 11, 1 ));
    
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
}