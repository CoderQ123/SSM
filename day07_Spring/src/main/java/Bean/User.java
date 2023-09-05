package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-22
 * @Time :15:36
 * @Author :Coder_Q
 */
@Data
public class User {
   private String name ;
   private Integer age;
   private Address addr;
   public User(){
      System.out.println("User空参构造器被调用！");
   }
   public User(String name,int age){
      this.name = name;
      this.age = age;
      System.out.println("User双参构造器被调用");
   }
   public User(String name,int age,Address addr){
      this.name = name;
      this.age = age;
      this.addr = addr;
      System.out.println("User三参构造器被调用");
   }
}
