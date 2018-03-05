import java.util.Arrays;

/**
 * @Author: chenzhen
 * @Date: 2018/3/5 14:22
 */
public class QuickSort {

    public static void main(String[] args){
        int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60};
        quickSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }

    public static void quickSort(int a[], int start, int end){
        if(start < end){
            int baseNum = a[start];
            int midNum;
            int i=start;
            int j=end;
            do{
                while(a[i]<baseNum && i<end){
                    i++;
                }
                while(a[j]>baseNum && j>start){
                    j--;
                }
                if(i<=j){
                    midNum = a[i];
                    a[i]=a[j];
                    a[j]=midNum;
                    i++;
                    j--;
                }
            }while(i<=j);
            if(start < i){
                quickSort(a,start,j);
            }
            if(end > i){
                quickSort(a,i,end);
            }
        }
    }
}
