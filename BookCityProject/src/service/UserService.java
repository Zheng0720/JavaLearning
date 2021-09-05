package service;

import pojo.User;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:43
 */
public interface UserService {
    /**
     * 注册用户
     *
     * @param user
     */
    public void registerUser(User user);

    /**
     * 登录用户
     *
     * @param user
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     *
     * @param username
     * @return 返回true表示用户名已经存在
     */
    public boolean existUserName(String username);
}
