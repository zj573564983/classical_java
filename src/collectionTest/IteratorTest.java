package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/***
 * 测试iterator接口，对集合进行遍历
 * 两个常用方法，hasNext（）；next（）
 * Iterator迭代器是一个接口，我们无法直接调用，需要使用Iterator接口的实现类对象
 * Collection接口中有一个方法 iterator
 * 迭代器的使用步骤：
 *  1.使用集合中的iterator方法，使用Iterator接口接收（多态）
 *  2.使用Iterator接口中的hasNext（）方法
 *  3.使用Iterator接口中的next（）方法取出集合中的下一个元素
 * @author zhangjie
 * @date 2019/4/2 11:34
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        Collections.addAll(coll,"hello","world","zhangjie","666");
        System.out.println(coll);

        Iterator<String> collectionIterator=coll.iterator();
        while(collectionIterator.hasNext()){
            System.out.println(collectionIterator.next());
        }

    }
}
