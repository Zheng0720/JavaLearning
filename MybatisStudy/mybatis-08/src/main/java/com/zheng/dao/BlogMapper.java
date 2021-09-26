package com.zheng.dao;

import com.zheng.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-24-14:50
 */
public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    List<Blog> queryBlogForEach(Map map);
}
