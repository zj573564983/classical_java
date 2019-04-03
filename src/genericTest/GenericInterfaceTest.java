package genericTest;

/*** 
 * @author zhangjie
 * @date 2019/4/2 20:13
 */
public class GenericInterfaceTest {
    public static void main(String[] args) {
        GenericInterfaceImpl gil=new GenericInterfaceImpl();
        gil.method("第一种方式");

        GenericInterfaceImpl2<Integer> gil2=new GenericInterfaceImpl2<>();
        gil2.method(123);
    }
}
