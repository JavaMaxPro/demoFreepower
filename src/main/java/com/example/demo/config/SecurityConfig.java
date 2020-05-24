package com.example.demo.config;

import com.example.demo.security.jwt.JwtConfigurer;
import com.example.demo.security.jwt.JwtTokenProvider;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtTokenProvider jwtTokenProvider;

    private static final String ADMIN_ENDPOINT="api/v1/admin/**";
    private static final String MANAGER_ENDPOINT="api/v1/manager/**";
    private static final String LOGIN_ENDPOINT="api/v1/auth/login";



    @Autowired
    public SecurityConfig(JwtTokenProvider jwtTokenProvider){
        this.jwtTokenProvider=jwtTokenProvider;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic().disable()
                .csrf().disable()//защита от взлома
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //указываем что не создаем сессию
                .and()
                .authorizeRequests()//авторизация запроса
                .antMatchers("LOGIN_ENDPOINT").permitAll()//что-то доступно всем
                .antMatchers("ADMIN_ENDPOINT").hasRole("ADMIN")//Разрешен только админу
                .antMatchers("MANAGER_ENDPOINT").hasRole("MANAGER")//Разрешен только мэнэджеру
                .anyRequest().authenticated()//все запросы должны быть аутоенфицированы
                .and()
                .apply(new JwtConfigurer(jwtTokenProvider));//передаем конфигурации где мы проверяем каждый запрос на наш сервер
    };
}
