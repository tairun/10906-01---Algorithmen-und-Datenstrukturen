public class InsertionSort {

  /** 
   * Insertationsort algorithm for int arrays, sorting the input array in place.
   **/
  public static void sort(int[] array) {
    // Aufgabe 1(a)
    for (int i = 0; i < array.length; i++) {
      int val = array[i];
      int j = i;
      while (j > 0 && array[j - 1] > val) {
        array[j] = array[j - 1];
        j--;
      }
      array[j] = val;
    }
  }

  /**
   * Insertationsort algorithm for int arrays, sorting the input array in place.
   * Works with any comparable object.
   **/
  public static <T extends Comparable<T>> void sort(T[] array) {
    // Aufgabe 1(d)
    for (int i = 0; i < array.length; i++) {
      T val = array[i];
      int j = i;
      while (j > 0 && val.compareTo(array[j - 1]) < 0) {
        array[j] = array[j - 1];
        j--;
      }
      array[j] = val;
    }
  }
}