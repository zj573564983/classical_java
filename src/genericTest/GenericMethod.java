package genericTest;

/***
 * 定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间
 * @author zhangjie
 * @date 2019/4/2 20:03
 */
public class GenericMethod {
    public static void main(String[] args) {
        GenericMethod m=new GenericMethod();
        m.method("abc");
        m.method(1);

        staticMethod("测试静态方法");
    }

    //定义一个含有泛型的静态方法
    public static <M> void staticMethod(M m){
        System.out.println(m);
    }
    //定义一个含有泛型的方法
    public <M> void method(M m){
        System.out.println(m);
    }
}
