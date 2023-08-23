public class Sort {
  public static void mergeSort(int[] a, int start, int end) {
    if (start == end) {
      return;
    }

    int mid = (start + end)/2;
    mergeSort(a, start, mid);
    mergeSort(a, mid + 1, end);
    combine(a, start, mid, end);
  }

  public static void combine(int[] a, int start, int mid, int end) {
    
    int[] aux = new int[end - start + 1];
    int m = start;
    int n = mid + 1;

    for (int i = 0; i < end - start + 1; i++) {
      if ( m > mid) {
        aux[i] = a[n];
        n++;
      } else if (n > end) {
        aux[i] = a[m];
        m++;
      } else if (a[m] < a[n]) {
        aux[i] = a[m];
        m++;
      } else {
        aux[i] = a[n];
        n++;
      }

      

      }
    for (int k = start; k <= end; k++) {
      a[k] = aux[k - start];
    }
    }


    public static void quicksort(int[] a, int start, int end) {
      if (start >= end) {
        return;
      }
      int q = partition(a, start, end);
      quicksort(a, start, q-1);
      quicksort(a, q + 1, end);
    }

    public static int partition (int[] a, int start, int end) {
      int q = end;
      for (int i = end - 1; i >= start; i--) {
        if (a[q] < a[i]) {
          if (i != q-1) {
            int temp = a[i];

            a[i] = a[q - 1];
            a[q - 1] = temp;

          }

          int temp = a[q];

          a[q] = a[q - 1];
          a[q - 1] = temp;

          q--;


        }
      }

      return q;
    }

    public static int quickSelect(int[] a, int k) {
      int left = 0;
      int right = a.length-1;

      while(left < right) {
        int q = partition(a, left, right);

        if (q == k -1)  {
          return a[q];
        } else if (k - -1 < q) {
          right = q - 1;
        } else {
          left = q + 1;
        }
      }

      return a[left];
    }

  }

