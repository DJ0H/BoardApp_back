// package kr.co.gsti._core.config;

// import org.springframework.boot.web.servlet.FilterRegistrationBean;
//  import org.springframework.context.annotation.Bean;
//  import org.springframework.context.annotation.Configuration;

//  @Configuration
//  public class FilterConfig {

//      @Bean
//      FilterRegistrationBean<JwtAuthorizationFilter> jwtFilter() {
//          FilterRegistrationBean<JwtAuthorizationFilter> bean = new FilterRegistrationBean<>(
//                  new JwtAuthorizationFilter());
//          bean.setOrder(0); // 낮은 번호부터 실행됨
//          return bean;
//      }
//  }