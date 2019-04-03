package lambdaTest;

/***
 * 使用lambda优化日志案例
 * lambda的特点：延迟加载
 * lambda必须存在函数式接口
 * @author zhangjie
 * @date 2019/3/31 9:04
 */
public class LambdaTest {
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder的接口
    public static void log(int level,MessageBuilder messageBuilder) {
        if(level==1){
            System.out.println(messageBuilder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String m1="hello";
        String m2="world";
        String m3="hi";

        log(1,()->{
            System.out.println("方法不会被执行");
            return m1+m2+m3;
        });
    }
}
