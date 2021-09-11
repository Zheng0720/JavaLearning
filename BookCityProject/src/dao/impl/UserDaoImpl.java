package dao.impl;

import dao.UserDao;
import pojo.User;


/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:22
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUserName(String username) {
        String sql = "select id,username,password,email from user_table where username=?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public int savaUser(User user) {
        String sql = "insert into  user_table (username, password, email) values(?,?,?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public User queryUserByUserNameAndPassword(String username, String password) {
        String sql = "select id,username,password,email from user_table where username=? and password=?";
        return queryForOne(User.class, sql, username, password);
    }
}
