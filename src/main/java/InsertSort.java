import java.util.Arrays;

/**
 * @Author: chenzhen
 * @Date: 2018/3/2 14:39
 */
public class InsertSort {
    public static void insertSort(int[] a){
        int i, j, insertNote;
        for(i=1; i<a.length; i++){
            insertNote = a[i];
            j = i-1;
            while(j >= 0 && insertNote < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNote;
        }
    }
    public static void main(String[] args){
        int[] a = new int[]{38,32,97,76,13,27,49};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
