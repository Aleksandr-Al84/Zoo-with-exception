import java.util.Arrays;

public class Sorting {

    public static void quickSort(int[] array, int l, int h) {           //Сортируем массив
        if (array.length == 0)
            return;

        if (l >= h)
            return;

        int m = l + (h - l) / 2;
        int base = array[m];

        int i = l, j = h;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }

            while (array[j] > base) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j)
            quickSort(array, l, j);

        if (h > i)
            quickSort(array, i, h);
    }


    public static void changeValue(int[] array) {       //Удаляем повторяющиеся элементы массива
        int[] array2 = Arrays.copyOfRange(array, 0, 10);
        int i = 1;
        int j = 0;

            while (i<array2.length) {
                if (array2[i] == array2[j]){
                    i++;
            } else {
                    array2[++j] = array2[i++];
                }
            }
            int[] array3 = new int[j+1];
            for (int k=0; k<array3.length; k++){
                array3[k] = array2[k];

            }
        System.out.print(Arrays.toString(array3));
        }


    public static void main (String[] args){
        int[] array = {1, 1, 1, 2, 1, 2, 2, 3, 4, 5};
        int l = 0;
        int h = array.length-1;
        quickSort(array, l, h);
        changeValue(array);


    }
}

