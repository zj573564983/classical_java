package clonetest;

public class Employee implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append("姓名："+name+",");
        s.append("年龄："+age+",");
        s.append("地址："+address+",");
        return s.toString();
    }
    @Override
    public Employee clone(){
        Employee employee=null;
        try{
            employee=(Employee) super.clone();
            employee.address=address.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return employee;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
