package Exercise;

import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Scanner;

/**
 * @author ZhengXinchang
 * @create 2021-08-23-11:02
 */
public class Exercise1 {

    //课后练习1
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("id:");
        int id = scanner.nextInt();
        System.out.print("name:");
        String name = scanner.next();
        System.out.print("email:");
        String email = scanner.next();
        System.out.print("birth:");
        String birth = scanner.next();

        String sql = "insert into customers(id,name,email,birth) values(?,?,?,?)";
        boolean update = update(sql, id, name, email, birth);
        if (update) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    public static boolean update(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            return ps.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, ps);
        }
        return false;
    }
}
