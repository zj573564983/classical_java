package genericTest;

import java.util.ArrayList;

/***
 * 用于测试集合中的不安全性
 * @author zhangjie
 * @date 2019/4/2 17:10
 */
public class GenericTest {
    public static void main(String[] args) {
        show2();
        //show1();
    }
    /*
        使用泛型创建集合对象
        好处：避免了类型转换的麻烦；把运行期异常提升到了编译器。
        弊端：泛型是什么类型，就只能存储什么类型的数据。
     */
    public static void show2(){

    }

    /*
        创建集合对象，不适用泛型。
        集合不适用泛型，默认存储类型是Object类型
        但是这样不安全，会触发异常。
     */
    public static void show1(){
        ArrayList list=new ArrayList();
        list.add("abc");
        list.add(1);

        for(Object o:list){
            System.out.println(o);
            //想要使用String类特有的方法，length（），不能使用，Object o="abc"
            //需要向下转型
            String s=(String)o;
            System.out.println(s.length());
        }
    }
}
