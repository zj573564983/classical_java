package genericTest;

/***
 *
 * @author zhangjie
 * @date 2019/4/2 19:59
 */
public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String> gc= new GenericClass<>();
        gc.setName("只能是字符串");

        String s=(String)gc.getName();
        System.out.println(s);
    }
}
