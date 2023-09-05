package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:33
 * @Author :Coder_Q
 */
@Data
public class employee {
    private Integer eid;
    private String ename;
    private Integer did;

    /**
     * 功能在spring创建对象的时候调用
     * 必须是公共的，无返回值，无参数的
     */
    public void initEmployee(){
        System.out.println("employee.initEmployee被调用");
    }
    public void destroyEmployee(){
        System.out.println("employee.destroyEmployee被调用");
    }
}
