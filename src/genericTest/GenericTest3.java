package genericTest;

import java.util.ArrayList;
import java.util.Collection;

/***
 * 泛型的上限限定：？extends E代表使用的泛型只能E类型的子类或本身
 * 泛型的下限限定：？super E代表使用的泛型只能是E类型的父类或本身
 * @author zhangjie
 * @date 2019/4/2 20:28
 */
public class GenericTest3 {
    public static void main(String[] args) {
        Collection<Integer> list1=new ArrayList<>();
        Collection<String> list2=new ArrayList<>();
        Collection<Number> list3=new ArrayList<>();
        Collection<Object> list4=new ArrayList<>();

        getElement1(list1);
    }
    //泛型的上限：此时的泛型？，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number>cool){

    }
    public static void getElement2(Collection<? super String>cool){

    }
}
