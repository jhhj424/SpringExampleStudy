package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration // 설정정보
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // 대상 제외
) // @Component 애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록한다
public class AutoAppConfig {
}
