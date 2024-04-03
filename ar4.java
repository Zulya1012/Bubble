public class ar4 {
  public static void main(String[] arg) {
    int a[] = {
      5,
      2,
      7,
      3
    };
    int x;
    for (int i = 0; i < a.length; i++) { // using a loop we for go through all the element array
      for (int j = 1; j < a.length; j++) {
        if (a[j] < a[j - 1]) {
          x = a[j];
          a[j] = a[j - 1];
          a[j - 1] = x;
        }
      }

    }
    for (int y: a)
      System.out.println(y);

  }
}
