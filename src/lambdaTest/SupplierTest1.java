package lambdaTest;

import java.util.function.Supplier;

/***
 * 使用Supplier获取数据元素的最大值
 * @author zhangjie
 * @date 2019/3/31 9:58
 */
public class SupplierTest1 {
    public static int getMax(Supplier<Integer> s){
        return s.get();
    }

    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        int result=getMax(()->{
            //获取数组的最大值并返回
            int max=a[0];
            for (int i : a) {
                if(i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println(result);
    }
}
