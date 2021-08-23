package Exercise;

import util.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Scanner;

/**
 * @author ZhengXinchang
 * @create 2021-08-23-11:34
 */
public class Exercise2 {
    public static void main(String[] args) {
//        insetInfo();
        findInfo();
//        deleteInfo();
    }

    /**
     * 插入信息
     */
    public static void insetInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("四级/六级：");
        int type = scanner.nextInt();
        System.out.print("身份证号：");
        String IDCard = scanner.next();
        System.out.print("准考证号码：");
        String ExamCard = scanner.next();
        System.out.print("学生姓名：");
        String StudentName = scanner.next();
        System.out.print("区域：");
        String Location = scanner.next();
        System.out.print("成绩：");
        int Grade = scanner.nextInt();

        String sql = "insert into examstudent(Type, IDCard, ExamCard, StudentName, Location, Grade) values (?,?,?,?,?,?)";
        boolean update = update(sql, type, IDCard, ExamCard, StudentName, Location, Grade);
        if (update) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    /**
     * 查看信息
     */
    public static void findInfo() {
        System.out.println("请选择你要输入的类型");
        System.out.println("a:身份证号");
        System.out.println("b:准考证号");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if ("a".equals(input)) {
            System.out.println("请输入身份证号：");
            String IDCard = scanner.next();
            String sql = "select * from examstudent where IDCard=?";
            Student student = getInstance(Student.class, sql, IDCard);
            if (student != null) {
                System.out.println("=======查询结果=========");
                System.out.println(student);
            } else {
                System.out.println("查无此人");
            }
        } else if ("b".equals(input)) {
            System.out.println("请输入准考证号：");
            String ExamCard = scanner.next();
            String sql = "select * from examstudent where ExamCard=?";
            Student student = getInstance(Student.class, sql, ExamCard);
            if (student != null) {
                System.out.println("=======查询结果=========");
                System.out.println(student);
            } else {
                System.out.println("查无此人");
            }
        } else {
            System.out.println("您的输入有误，请重新进入程序");
        }
    }

    /**
     * 删除指定的学生信息
     */
    public static void deleteInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入准考证号：");
        String ExamCard = scanner.next();
        String sql = "delete from examstudent where ExamCard=?";
        boolean update = update(sql, ExamCard);
        if (update) {
            System.out.println("删除成功");
        } else {
            System.out.println("查无此人,请重新输入");
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

    public static <T> T getInstance(Class<T> clazz, String sql, Object... args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            //执行，获取结果集
            resultSet = ps.executeQuery();
            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取列数
            int columnCount = metaData.getColumnCount();
            if (resultSet.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取每个列的值
                    Object value = resultSet.getObject(i + 1);
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //通过反射，将对象指定的columnName的属性赋值为指定的value
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, value);
                }
                return t;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, ps, resultSet);
        }
        return null;
    }
}


