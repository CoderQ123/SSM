package TypeHandler;

import org.apache.ibatis.type.*;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :21:50
 * @Author :Coder_Q
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(String[].class)
public class MyTypeHandler extends BaseTypeHandler<String[]> {

    /**
     * 功能：处理增删改中  占位符  从java数据类型 -》 JDBC类型的映射
     * @param ps 通过ps可以设置占位符
     * @param i 第i个占位符的位置
     * @param parameter 参数
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String[] parameter, JdbcType jdbcType) throws SQLException {
        String data = null;
        for (String s : parameter) {
            data += s;
        }
        ps.setObject(i,data);
    }

    /**
     * 功能：进行查询的时候结果及映射
     * @param rs
     *          the rs
     * @param columnName
     *          Colunm name, when configuration <code>useColumnLabel</code> is <code>false</code>
     * @return
     * @throws SQLException
     */
    @Override
    public String[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("根据columnName的结果集映射");
        String s = (String) rs.getObject(columnName);
        String[] split = s.split(",");
        return split;
    }

    @Override
    public String[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String s = (String) rs.getObject(columnIndex);
        String[] split = s.split(",");
        return split;
    }

    @Override
    public String[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String s = (String) cs.getObject(columnIndex);
        String[] split = s.split(",");
        return split;
    }
}
