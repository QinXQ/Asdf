package asdf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by QinXQ on 2017/3/25.
 */
@Configuration
@ComponentScan(basePackages = {"asdf"},
        excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class SpringConfig {
}
