package lambdaTest;

import java.util.function.Consumer;

/***
 * Consumer接口的默认方法andThen
 * 作用：可以让两个Consumer拼接到一起，再对数据进行消费
 * @author zhangjie
 * @date 2019/3/31 10:08
 */
public class andThenTest {
    //调用一个方法，使用两个Consumer接口参数
    public static void method(String name, Consumer<String> con1,Consumer<String> con2){
        //直接使用两个Consumer接口accept
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        method("someThing"
                ,(s)->{
                    System.out.println(s.toUpperCase());
                }
                ,(s)->{
                    System.out.println(s.toLowerCase());
                });
    }
}
