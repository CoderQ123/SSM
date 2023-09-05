package Mapper;

import Bean.employee;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:34
 * @Author :Coder_Q
 */
public interface EmployeeMapper {
    List<employee> getAll();
}
