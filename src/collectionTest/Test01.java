package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/***
 * @author zhangjie
 * @date 2019/4/2 11:29
 */
public class Test01 {

    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        Collections.addAll(coll,"hello","world","zhangjie","666");
        System.out.println(coll);
//        boolean result=coll.remove("zhangjie");
//        System.out.println(result);
//        System.out.println(coll);
//        coll.clear();
//        boolean result1=coll.contains("world");
//        System.out.println(result1);
//        System.out.println(coll);

        Object arr=coll.toArray();
        System.out.println(arr.toString());
    }
}
