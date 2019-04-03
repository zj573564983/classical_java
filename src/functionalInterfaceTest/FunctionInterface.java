package functionalInterfaceTest;

/***
 * 测试函数式接口
 * 有且仅有一个抽象方法,当然可以包含其他的方法
 * @FunctonalInterface注解式判断一个函数是否是函数式接口
 * @author zhangjie
 * @date 2019/3/30 19:50
 */
@FunctionalInterface
public interface FunctionInterface {
    public abstract void method();

}
