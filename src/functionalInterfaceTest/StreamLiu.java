package functionalInterfaceTest;

import java.util.ArrayList;
import java.util.List;

/***
 * 测试stream流的方式，遍历集合，对集合中的元素进行过滤
 * jdk1.8之后出现
 * @author zhangjie
 * @date 2019/3/30 19:37
 */
public class StreamLiu {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("我的天");
        list.add("我的");
        list.add("hhh");
        list.add("张杰");
        list.add("我三丰");
        list.add("我");

        list.stream()
                .filter(e->e.startsWith("我"))
                .filter(e->e.length()==3)
                .forEach(e-> System.out.println(e));
    }
}
