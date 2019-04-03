package streamTest;

import java.util.stream.Stream;

/***
 * concat可以把两个流合成一个流
 * 静态方法
 * @author zhangjie
 * @date 2019/4/1 10:35
 */
public class concatTest {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        Stream<String> stream2 = Stream.of("张无忌", "赵敏", "张三丰", "周芷若");

        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach((s)->{
            System.out.println(s);
        });

    }
}
