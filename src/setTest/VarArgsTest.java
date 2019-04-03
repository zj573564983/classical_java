package setTest;

/***
 * 测试可变参数；可变参数是jdk1.5之后出现的特性
 * 使用前提：方法的参数列表数据类型已经确定，但是参数的个数不确定
 * 使用格式：
 * 可变参数的原理：
 * 可变参数底层就是一个数组，根据传递参数的不同，会创建不同长度的数组
 * @author zhangjie
 * @date 2019/4/2 16:53
 */
public class VarArgsTest {
    public static void main(String[] args) {
        int result=sum1(10,20,30,40);
        System.out.println(result);
    }
    //可变参数的终极写法
    public static void sumEnd(Object o){}
    /*
        可变参数的注意事项：
        一个方法的参数列表只能有一个可变参数；
        如果方法的参数有多个，那么可变参数必须写在参数列表的末尾。
     */
    //计算1+。。。+n整数和的方法
    //使用可变参数
    public static int sum1(int ...arr){
        int result=0;
        for(int i:arr) result+=i;
        //System.out.println(arr);
        return result;
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
