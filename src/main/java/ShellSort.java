import java.util.Arrays;

/**
 * @Author: chenzhen
 * @Date: 2018/3/2 17:10
 */
public class ShellSort {

    public static void main(String[] args){
        int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
        shellSortSmallToBig(data);
        System.out.println(Arrays.toString(data));
    }

    public static void shellSortSmallToBig(int[] data){
        int j = 0;
        int temp = 0;
        for(int increment = data.length/2; increment > 0; increment /= 2 ){
            System.out.println("increment is: "+increment);
            for(int i = increment; i<data.length;i++){
                temp = data[i];
                for(j=i-increment; j>=0; j--){
                    if(temp < data[j]){
                        data[j+1] = data[j];
                    }else{
                        break;
                    }
                }
                data[j+increment]=temp;
            }
        }
        for(int i=0; i< data.length; i++){
            System.out.println(data[i]);
        }
    }
}
