package genericTest;

/***
 * 第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
 *
 * 可以借鉴Scanner类
 * public final class Scanner implements Iterator<String>{
 *     public String next(){}
 * }
 * @author zhangjie
 * @date 2019/4/2 20:10
 */
public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
