package basis;

// 只有java.lang 下的包不需要导包

public class MyJavaBean {
    private String name;
    private int age;

    public MyJavaBean() {

    }

    public MyJavaBean(String name, int age) {
        this.name = name;
        this.age = age;
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
