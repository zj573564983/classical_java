package collectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * 测试Collections工具类中的方法
 * @author zhangjie
 * @date 2019/4/2 10:38
 */
public class shuffleTest {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
        //使用Collections中的addAll方法
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);

        //使用shuffle方法打乱集合中的顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
