package Bean;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:11
 * @Author :Coder_Q
 */
public class User {
    private String name;
    private static User user = new User();
    private User(){

    }
    public static User getUser(){
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
