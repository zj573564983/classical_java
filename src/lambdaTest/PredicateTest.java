package lambdaTest;

import java.util.function.Predicate;

/***
 * Predicate接口就是对某种数据类型的数据进行判断，然后返回一个bool值
 * Predicate接口中有一个and方法，可以连接两个Predicate接口的返回值，等价于&&
 * 还有一个or方法，等价于||
 * 有一个negate方法，等价于！
 * @author zhangjie
 * @date 2019/3/31 10:26
 */
public class PredicateTest {
    public static boolean method(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s="hello";
        boolean result=method(s,(str)->{
            return str.length()>=5;
        });
        System.out.println(result);
    }
}
