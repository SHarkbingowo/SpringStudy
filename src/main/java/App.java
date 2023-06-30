import com.spring.study.config.SpringConfig;
import com.spring.study.domain.Brand;
import com.spring.study.service.BrandService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        applicationContext.registerShutdownHook();

        BrandService brandService = applicationContext.getBean(BrandService.class);
        Brand brand = brandService.selectById(1);

        System.out.println(brand);

    }
}
