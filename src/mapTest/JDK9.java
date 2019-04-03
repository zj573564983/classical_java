package mapTest;

import java.util.List;

/***
 * JDK9之后增加了一个静态的of方法，可以给集合一次性添加多个方法。
 * 如List.of("a","b","c");
 * of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
 * of方法的返回值是一个不能改变的集合，集合不能再适用add，put方法添加元素，会抛出异常
 * Set接口和Map接口在调用of方法的时候，不能有重复的元素，不然会抛出异常
 * @author zhangjie
 * @date 2019/4/2 13:54
 */
public class JDK9 {
    public static void main(String[] args) {
        List<String> list;
    }
}
