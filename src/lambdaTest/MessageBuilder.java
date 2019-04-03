package lambdaTest;

/*** 
 * @author zhangjie
 * @date 2019/3/31 9:05
 */
@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接消息的抽象方法，返回被拼接的对象
    public abstract String buildMessage();
}
