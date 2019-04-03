package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/***
 * Stream接口中的filter方法
 * Stream<>  filter(Predicate<> predicate)
 * @author zhangjie
 * @date 2019/4/1 10:15
 */
public class filterTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "赵敏", "张三丰", "周芷若");
        //对stream流进行过滤
        Stream<String> result = stream.filter((name) -> {
            return name.startsWith("张");
        });
        //遍历result流
        result.forEach((name)->{
            System.out.println(name);
        });

        /*
            stream属于管道流，只能被消费一次
            第一个stream流调用完毕方法，数据就会转到下一个stream上
            stream流只能使用一次方法
         */
    }
}
