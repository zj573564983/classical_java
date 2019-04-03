package lambdaTest;

import java.util.function.Consumer;

/***
 * Consumer接口是一个消费型接口，泛型执行什么数据，accept（）方法就可以消费什么数据
 * @author zhangjie
 * @date 2019/3/31 10:02
 */
public class ConsumerTest {
    //定义一个方法，方法传递一个字符串姓名，传递consumer接口
    public static void method(String name, Consumer<String> c){
        c.accept(name);
    }

    public static void main(String[] args) {
        //调用method接口
        method("shit",(n)->{
            //直接数据字符串
            System.out.println(n);

            //把字符串反转输出
            String reName=new StringBuffer(n).reverse().toString();
            System.out.println(reName);
        });
    }
}
