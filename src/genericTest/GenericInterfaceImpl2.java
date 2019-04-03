package genericTest;

/***
 * 含有泛型的接口的第二种使用方式：
 * 接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
 * 就相当于定义了一个含有泛型的类型
 * 与ArrayList接口类似
 * public interface List<E>{
 *      boolean add(E e);
 *      E get(int i);
 * }
 * public class ArrayList<E> implements List<E>{
 *     public boolean add(E e){}
 *     public E get(int i){}
 * }
 * @author zhangjie
 * @date 2019/4/2 20:14
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
