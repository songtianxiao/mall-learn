package store.aiss.mall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 类说明:SpringSecurity的配置
 */
@Configuration
@EnableWebSecurity
//开启基于方法的安全认证机制，
//也就是说在web层的controller启用注解机制的安全确认，
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {




}
