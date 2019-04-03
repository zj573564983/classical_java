package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/***
 * 增强for循环，jdk1.5之后出现的新特性
 * @author zhangjie
 * @date 2019/4/2 11:50
 */
public class ForeachTest {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        Collections.addAll(coll,"hello","world","zhangjie","666");
        System.out.println(coll);

        for(String s:coll){
            System.out.println(s);
        }
    }
}
