package dao;


import pojo.User;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:17
 */

public interface UserDao {

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    public User queryUserByUserName(String username);

    /**
     * 保存用户信息
     *
     * @param user
     * @return
     */
    public int savaUser(User user);

    /**
     * 根据用户名和密码登录
     *
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUserNameAndPassword(String username, String password);

}
