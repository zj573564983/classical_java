package clonetest;

public class Test {
    public static void main(String []args){
        System.out.println("克隆之前：");
        Address address=new Address("中国","吉林","长春");
        Employee e1=new Employee("张X",12,address);
        System.out.println("e1的信息：");
        System.out.println(e1);
        System.out.println("克隆之后：");
        Employee e2=e1.clone();
        e2.getAddress().setCity("上海");
        e2.getAddress().setState("中国");
        e2.getAddress().setProvince("上海");
        e2.setName("张杰");
        e2.setAge(8);
        System.out.println("e1的信息：");
        System.out.println(e1);
        System.out.println("e2的信息：");
        System.out.println(e2);
    }
}
