import com.zheng.dao.BlogMapper;
import com.zheng.pojo.Blog;
import com.zheng.utils.IDUtils;
import com.zheng.utils.MybatisUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-24-15:02
 */
public class MyTest {
    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);


        blog.setId(IDUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);


        blog.setId(IDUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        sqlSession.close();
    }

    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("author","金东寒");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map=new HashMap();
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        
        map.put("ids",list);
        List<Blog> blogs = mapper.queryBlogForEach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
