package mapTest;

import java.util.HashMap;
import java.util.Map;

/***
 * 使用HashMap解决字符串中的字符出现次数问题
 * @author zhangjie
 * @date 2019/4/2 13:48
 */
public class Test1 {
    public static void main(String[] args) {
        String s="aaabbbbbccc";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Integer value=map.get(s.charAt(i));
            if(value==null){
                map.put(s.charAt(i),1);
            }else{
                value++;
                map.put(s.charAt(i),value);
            }
        }
        System.out.println(map);

    }
}
