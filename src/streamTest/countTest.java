package streamTest;

import java.util.stream.Stream;

/***
 * 测试stream流中的count方法，用于统计stream流中元素的个数
 * Long count（）；终结方法
 * @author zhangjie
 * @date 2019/4/1 10:29
 */
public class countTest {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        long sum = stream.count();

        System.out.println(sum);

    }
}
