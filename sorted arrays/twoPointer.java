public class twoPointer {
  public static boolean isSum(int arr[], int x) {
    int n = arr.length;
    int left = 0, right = n - 1;
    while (left < right) {

      if (arr[left] + arr[right] == x)
        return true;
      else if (arr[left] + arr[right] > x) {
        right = right - 1;
       // right--;
      } else {
        left = left + 1;
        // left++;
      }
    }
    return false;

  }

  public static void main(String[] args) {
    twoPointer p = new twoPointer();
    int arr[] = { 2, 5, 8, 21, 30 };
    int x = 23;
    System.out.println(" " + p.isSum(arr, x));
  }

}