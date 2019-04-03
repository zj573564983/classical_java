package functionalInterfaceTest;

/***
 * 函数式接口的使用，一般可以作为方法的参数和返回类型
 * @author zhangjie
 * @date 2019/3/30 19:55
 */
public class FunctionInterfaceUse {
    //定义一个方法，可以使用函数式接口作为参数
    public static void show(FunctionInterface functionInterface){
        functionInterface.method();
    }

    public static void main(String[] args) {
        //调用show对象，方法的参数是一个接口，所以可以使用接口的实现类对象
        show(new FunctionInterfaceImpl());

        //调用show对象，方法的参数是一个接口，所以我们可以传递接口的匿名内部类
        show(new FunctionInterface() {
            @Override
            public void method() {
                System.out.println("重载接口匿名内部类");
            }
        });

        //调用show对象，方法的参数是一个接口，所以我们可以使用lambda表达式
        show(()->{
            System.out.println("lambda表达式作为参数");
        });

        //简洁写法
        show(()->System.out.println("lambda表达式作为参数"));
    }
}
