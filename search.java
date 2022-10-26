package hello;

/**
 * TODO shreyama This type ...
 *
 */
public class search {
  public static int Search(int[] arr, int key) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    int[] a1 = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
    int key = 10;
    System.out.println(key + " is at " + Search(a1, key));
  }

}
