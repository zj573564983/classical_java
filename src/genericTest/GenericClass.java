package genericTest;

/***
 * 定义一个含有泛型的类，模拟ArrayList使用
 * @author zhangjie
 * @date 2019/4/2 19:59
 */
public class GenericClass<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
