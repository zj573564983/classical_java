package lambdaTest;

import java.util.function.Consumer;

/***
 *
 * @author zhangjie
 * @date 2019/3/31 10:18
 */
public class andThenTest1 {
    public static void method(String name, Consumer<String> con1, Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        String arr[]={"古力娜扎，女","迪丽热巴，女","张杰，男"};
        for (String s : arr) {
            method(s
                    ,(name)->{
                        System.out.println("姓名："+name.split("，")[0]);
                    }
                    ,(name)->{
                        System.out.println("性别："+name.split("，")[1]);
                    });
        }
    }
}
