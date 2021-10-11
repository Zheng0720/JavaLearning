package spring_ioc_ano.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author ZhengXinchang
 * @create 2021-10-06-9:05
 */
//标志该类是spring的核心配置类
@Configuration
//扫描
@ComponentScan("spring_ioc_ano")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
