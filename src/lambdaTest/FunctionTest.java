package lambdaTest;

import java.util.function.Function;

/***
 * Function接口是用来根据一个类型的数据得到另一个类型的数据
 * 将String类型的数据转化为Integer类型
 * @author zhangjie
 * @date 2019/3/31 10:34
 */
public class FunctionTest {
    public static Integer method(String s, Function<String ,Integer> fun){
        return fun.apply(s);
    }

    public static void main(String[] args) {
        Integer result=method("123",(s)->{
            return Integer.parseInt(s);
        });
        System.out.println(result);
    }
}
