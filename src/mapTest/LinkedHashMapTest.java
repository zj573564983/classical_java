package mapTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/***
 * LinkedHashMap继承了HashMap
 * LinkedHashMap接口的哈希表和链表列表实现，具有可预知的迭代顺序
 * 所以这是一个有序的map.LinkedHashMap存跟取的顺序是一直的。
 * @author zhangjie
 * @date 2019/4/2 13:40
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三", 12);
        map.put("张无忌", 16);
        map.put("张三丰", 120);
        map.put("周芷若", 18);
        System.out.println(map);

        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("张三", 12);
        linkedHashMap.put("张无忌", 16);
        linkedHashMap.put("张三丰", 120);
        linkedHashMap.put("周芷若", 18);
        System.out.println(linkedHashMap);
    }
}
