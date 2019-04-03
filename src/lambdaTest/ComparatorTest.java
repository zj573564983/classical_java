package lambdaTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/***
 * @author zhangjie
 * @date 2019/3/31 9:42
 */
public class ComparatorTest {
    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
        //lambda表达式
//        return (String o1,String o2)->{
//            return o1.length()-o2.length();
//        };
        return (o1,o2)->o1.length()-o2.length();
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaaaa");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        //排序前list
        System.out.println(list.toString());
        list.sort(getComparator());
        //排序后list
        System.out.println(list.toString());

    }
}
