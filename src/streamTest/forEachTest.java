package streamTest;

import java.util.stream.Stream;

/***
 * Stream流中的常用方法 forEach
 * forEach（Consumer<T> action)
 * @author zhangjie
 * @date 2019/4/1 10:10
 */
public class forEachTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王五","田六");
        stream.forEach((name)->{
            System.out.println(name);
        });
    }
}
