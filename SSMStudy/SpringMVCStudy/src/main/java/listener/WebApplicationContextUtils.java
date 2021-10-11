package listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author ZhengXinchang
 * @create 2021-10-06-11:18
 */
public class WebApplicationContextUtils {
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("context");
    }
}
