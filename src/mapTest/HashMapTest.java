package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/***
 * 测试HashMap，HashMap可以存储自定义的键值对类型
 * @author zhangjie
 * @date 2019/4/2 13:20
 */
public class HashMapTest {
    public static void main(String[] args) {
        //test1();
        test2();

    }

    //使用map存储自定义的数据类型
    //如果使用Person自定义对象作为key，就必须重写hashCode（）和equals（）方法来保证key的唯一性。

    public static void test2() {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 12), "明教");
        map.put(new Person("张无忌", 16), "明教");
        map.put(new Person("张三丰", 120), "武当");
        map.put(new Person("张无忌", 16), "峨眉");

        Set<Person> set = map.keySet();
        for (Person p : set) {
            String s = map.get(p);
            System.out.println(p + "=" + s);
        }
    }

    //使用迭代器方法以及增强for循环遍历,
    //map中存储的是基本数据类型
    public static void test1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 12);
        map.put("张无忌", 16);
        map.put("张三丰", 120);
        map.put("周芷若", 18);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        for (String s : set) {
            Integer i = map.get(s);
            System.out.println(s + "=" + i);
        }
        System.out.println("-----------------");
        while (it.hasNext()) {
            String s = it.next();
            Integer i = map.get(s);
            System.out.println(s + "=" + i);
        }

    }
}
