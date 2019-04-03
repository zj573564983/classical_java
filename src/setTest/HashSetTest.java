package setTest;

import java.util.HashSet;

/***
 * HashSet集合存储数据的结构（哈希表）
 * jdk1.8之前：哈希表=数组+链表
 * jdk1.8之后：哈希表=数组+红黑树（提高查询的速度）
 * @author zhangjie
 * @date 2019/4/2 16:08
 */
public class HashSetTest {
    //重地和通话的hashCode在string的重写方法中是一样的。

    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String("重地");
        String s3=new String("通话");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        HashSet<String> hashSet=new HashSet<>();
        //HashSet中的add会判断两个条件，一个是元素的hashCode是否有重复
        //第二个就是调用equals方法来判断两个元素是否想等
        hashSet.add("abc");
        hashSet.add("重地");
        hashSet.add("通话");

        System.out.println(hashSet);
    }
}
