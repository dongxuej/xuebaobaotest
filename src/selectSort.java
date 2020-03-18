public class selectSort {
    public static int[] selectSort(int[] array){
        for (int i=0;i<array.length;i++){
            int indexMin=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[indexMin]){
                    indexMin = j;
                }
            }
            array = swap(array,i,indexMin);
        }
        return array;
    }
    public static int[] swap(int[] arr,int i,int indexMin){
        int temp = arr[i];
        arr[i] = arr[indexMin];
        arr[indexMin] = temp;
        return arr;
    }
    public static void  main(String args[]){
        int [] arr={5,2,3,4,22,123,0};
        int[] a = selectSort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(a[i]);
        }
    }
}
