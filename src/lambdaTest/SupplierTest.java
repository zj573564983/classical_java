package lambdaTest;

import java.util.function.Supplier;

/***
 * 常用的函数式接口
 * java.util.function.supplier<T>接口仅包含一个无参的方法：T get（）。
 * Supplier<T>接口被称之为生产型接口
 * @author zhangjie
 * @date 2019/3/31 9:53
 */
public class SupplierTest {
    //定义一个方法调用Supplier中的get方法
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String s=getString(()->{
            return "zhangjie";
        });
        System.out.println(s);
    }
}
