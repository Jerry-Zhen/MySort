import java.util.Arrays;

/**
 * @Author: chenzhen
 * @Date: 2018/3/2 17:10
 */
public class ShellSort {

    public static void main(String[] args){
        int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60};
        shellSortSmallToBig(data);
        System.out.println(Arrays.toString(data));
    }

    public static void shellSortSmallToBig(int[] data){
        //获取数组的长度
        int length = data.length;
        //采用step/2，（step/2）/2。。。的希尔序列步长进行数组的分组
        for(int step = length/2; step>0; step /=2){
            System.out.println("step is ..." + step);
            //循环每一个分组的数组
            for(int i=0; i<step; i++){
                //对每一个分组的子数组进行插入排序
                for(int j = i+step; j<length; j+=step){
                    int temp = data[j];
                    int k = j-step;
                    while(k>=0 && data[k]>temp){
                        data[k+step] = data[k];
                        k-=step;
                    }
                    data[k+step]=temp;
                }
            }
        }
        for(int i=0; i< data.length; i++){
            System.out.println(data[i]);
        }
    }
}
