package genericTest;

import java.util.ArrayList;
import java.util.Iterator;

/***
 * 测试泛型的通配符
 * ？：代表任意的数据类型
 * 使用方式：不能创建对象使用；只能作为方法的参数使用
 * @author zhangjie
 * @date 2019/4/2 20:21
 */
public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("abc");
        list2.add("zhang");

        pringArray(list1);
        pringArray(list2);
    }

    /*
        定义一个方法，能遍历所有类型的ArrayList集合
        注意：泛型没有继承概念的
     */
    public static void pringArray(ArrayList<?> list){
        //使用遍历
        Iterator<?> it=list.iterator();
        while(it.hasNext()){
            //it.next（）方法取出元素是Object，可以接收任意的数据类型
            System.out.println(it.next());
        }
    }
}
