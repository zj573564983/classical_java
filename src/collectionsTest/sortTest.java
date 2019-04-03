package collectionsTest;

import java.util.*;

/***
 * this变量-o变量代表升序
 * @author zhangjie
 * @date 2019/4/2 10:43
 */
public class sortTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(43);
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(1);
        //使用sort排序方法
        Collections.sort(list);
        System.out.println(list);

        //使用sort中自定义排序规则
        Collections.sort(list,(i,j)->{
            return j-i;
        });
        System.out.println(list);

        //使用sort定义Person类的排序规则
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("张三",12));
        personList.add(new Person("李四",20));
        personList.add(new Person("王五",18));
        personList.add(new Person("田六",16));
        System.out.println(personList);

        Collections.sort(personList);
        System.out.println(personList);
    }
}
