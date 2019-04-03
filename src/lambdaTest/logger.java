package lambdaTest;

/***
 * 简单日志实现
 * 直接log方法存在性能浪费问题，如果level为2之后，它会先拼接字符串，再带入函数
 * @author zhangjie
 * @date 2019/3/30 20:10
 */
public class logger {
    public static void log(int level,String message){
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String m1="hello";
        String m2="world";
        String m3="hi";

        log(1,m1+m2+m3);
    }
}
