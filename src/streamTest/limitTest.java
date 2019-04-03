package streamTest;

import java.util.stream.Stream;

/***
 * 测试stream流中的limit方法
 * @author zhangjie
 * @date 2019/4/1 10:32
 */
public class limitTest {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        Stream<String> limit = stream.limit(2);

        limit.forEach((s)->{
            System.out.println(s);
        });

    }
}
