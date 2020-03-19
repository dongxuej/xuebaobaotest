public class Main {
    public  static <T extends Comparable<? super T>> T[] selectSort(T[] array){
        for (int i=0;i<array.length;i++){
            int indexMin=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j].compareTo(array[indexMin])<0){
                    indexMin = j;
                }
            }
            array = swap(array,i,indexMin);
        }
        return array;
    }
    public static <T> T[]  swap(T[] arr,int i,int indexMin){
        T temp = arr[i];
        arr[i] = arr[indexMin];
        arr[indexMin] = temp;
        return arr;
    }
    public static void  main(String args[]){
        Integer[] arr =new Integer[] {1,28,30,4,58,6};
        Double[] dou = new Double[] {1.1,32.2,3.3,66.66,8.0};
        String[] str = new String[] {"yas","sadx","werd","111"};
//        selectSort(arr);
//        selectSort(dou);
        selectSort(str);
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int i=0;i< dou.length;i++){
//            System.out.println(dou[i]);
//        }
        for (int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }
}
