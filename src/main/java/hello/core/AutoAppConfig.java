package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration // 설정정보
@ComponentScan( // 기본 설정은 : @ComponentScan이 붙은 설정정보 클래스의 패키지가 스캔 시작 패키지가 된다.
        // basePackages = "hello.core", // 탐색할 패키지의 시작위치 지정, 해당 패키지부터 하위 패키지 모두 탐색 (여러개도가능)
        // basePackageClasses = AutoAppConfig.class, // 해당 클래스의 패키지부터 스캔
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // 대상 제외
) // @Component 애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록한다
public class AutoAppConfig {
}