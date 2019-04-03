package streamTest;

import java.util.stream.Stream;

/***
 * 测试stream流中的map方法
 * map(Function<> mapper)
 * @author zhangjie
 * @date 2019/4/1 10:25
 */
public class mapTest {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        //使用map方法，将字符串数据转化成Integer对象数据
        Stream<Integer> result=stream.map((String s)->{
            return Integer.parseInt(s);
        });

        result.forEach((i)->{
            System.out.println(i.getClass());
        });


    }
}
