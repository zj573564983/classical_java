package streamTest;

import java.util.stream.Stream;

/***
 * 测试stream流中的skip方法
 * @author zhangjie
 * @date 2019/4/1 10:34
 */
public class skipTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        Stream<String> skip = stream.skip(2);

        skip.forEach((s)->{
            System.out.println(s);
        });
    }
}
