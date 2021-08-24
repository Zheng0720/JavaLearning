package ch04;

import ch03.Customer;
import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.*;
import java.sql.*;

/**
 * 测试使用PreparedStatement操作blob数据
 *
 * @author ZhengXinchang
 * @create 2021-08-23-14:35
 */
public class BlobTest {
    //向数据表customers插入blob字段
    @Test
    public void testInsert() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into customers(name,email,birth,photo)values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setObject(1, "刘亦菲");
        ps.setObject(2, "lyf@qq.com");
        ps.setObject(3, "1990-10-22");
        FileInputStream fis = new FileInputStream(new File("src/liuyifei.png"));
        ps.setBlob(4, fis);
        ps.execute();
        JDBCUtils.closeResource(connection, ps);
    }

    //查询数据表customers插入blob字段
    @Test
    public void testQuery() {
        InputStream is = null;
        FileOutputStream fos = null;
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select id,name,email,birth,photo from customers where id=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, 20);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                Date birth = resultSet.getDate(4);
                Customer customer = new Customer(id, name, email, birth);
                System.out.println(customer);

                //将blob类型的字段下载下来，以文件的形式保存到本地
                Blob photo = resultSet.getBlob("photo");
                is = photo.getBinaryStream();
                fos = new FileOutputStream("src/liuyifei_sql.png");
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JDBCUtils.closeResource(connection, ps);
        }
    }
}
