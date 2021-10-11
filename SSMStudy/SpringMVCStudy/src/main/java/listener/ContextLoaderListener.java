package listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

/**
 * @author ZhengXinchang
 * @create 2021-10-06-11:00
 */
public class ContextLoaderListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("context",context);
        System.out.println("spring容器创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
