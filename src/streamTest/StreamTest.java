package streamTest;

import java.util.*;
import java.util.stream.Stream;

/***
 * java.util.stream.Stream<T>jdk8新加入的最常用的流接口，它不是函数式接口。</T>
 * 所有Collection集合都可以通过stream默认方法获取流
 * @author zhangjie
 * @date 2019/4/1 9:45
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stream<String> stream1=list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map=new HashMap<>();
        //将map中的键存储到Collection集合中
        Set<String> mapSet = map.keySet();
        Stream<String> stream3=mapSet.stream();

        //将map中的值存储到Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //将map转化成set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转化成stream流
        int []arr={1,2,3,4,5};
        Stream<int[]> stream6 = Stream.of(arr);

        //同样可以将Stream数组转化成stream流



    }

}
