class sortArray {
     boolean arraysort(int arr[]) {
          int i, j;
          int n = arr.length;
          for (i = 0; i < n; i++) {
               for (j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                         return false;

                    }

               }
          }
          return true;
     }

     boolean isSorted(int arr[]) {
          for (int i = 1; i < arr.length; i++) {
               if (arr[i] < arr[i - 1]) {
                    return false;
               }
          }
          return true;
     }
      int revArray(int arr[]){
           int i;
           int arr2[];
           for(i=arr.length;i<=0;i--){
                  arr2[i]=arr[i];
           }
           return arr2[i];
      }

     public static void main(String[] args) {
          int arr[] = { 5, 7, 12, 17, 23 };
          sortArray obj = new sortArray();
          boolean result = obj.arraysort(arr);
          boolean result2 = obj.isSorted(arr);
         int result3 =obj.revArray(arr);     
 
          System.out.println(result);
          System.out.println(result2);
          System.out.println(result3);
     }

}