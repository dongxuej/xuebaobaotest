public class InsertSort {
    public  static <T extends Comparable<? super T>> T[] selectSort(T[] array){
        for (int i=1;i<array.length;i++){
            T e = array[i];
            int j;
            for (j=i;j>0 && array[j-1].compareTo(e)>0;j--){
                array[j] = array[j-1];
                }
            array[j] = e;
            }

        return array;
    }
    public static void  main(String args[]) {
        Integer[] arr = new Integer[]{1, 28, 30, 4, 58, 6};
        Double[] dou = new Double[]{1.1, 32.2, 3.3, 66.66, 8.0};
        String[] str = new String[]{"yas", "sadx", "werd", "111"};
        selectSort(arr);
        selectSort(dou);
        selectSort(str);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.println(" ");
            }
        }
        for (int i = 0; i < dou.length; i++) {
            System.out.print(dou[i] + " ");
            if (i == dou.length - 1) {
                System.out.println(" ");
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + ' ');
            if (i == str.length - 1) {
                System.out.println(" ");
            }
        }

    }
}