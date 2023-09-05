package FactoryBean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import java.io.InputStream;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:28
 * @Author :Coder_Q
 */
public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    private String config;
    @Override
    public SqlSessionFactory getObject() throws Exception {
        //1.读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream(config);
        //2.创建builder对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.builder.build
        return sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
