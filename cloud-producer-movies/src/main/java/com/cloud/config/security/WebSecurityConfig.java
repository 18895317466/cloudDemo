//package com.cloud.config.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
///**
// * Created by ouyang on 2019/4/29.
// *
// * spring Security 配置类
// */
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true )
//public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        //所有请求都经过 http basic renzheng
//        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        //明文编码器，这是一个不做任何操作的密码编辑器，
//        //spring提供给我们做的明文测试
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Autowired
//    private  CustomerUserDetailService customerUserDetail;
//
//
//}
//
//class CustomerUserDetailService implements UserDetailsService{
//    /**
//     * 模拟两个账户
//     * 1 账号 user 密码 pass23456，角色 user-role
//     * 1 账号 admin 密码 pass23456，角色 admin-role
//     */
//    @Override
//    public UserDetails loadUserByUsername(String userName){
//        if("user".equals(userName)){
//            return  new SecurityUser("user","123456","user-role");
//        }
//    }
//}
//
//class SecurityUser implements UserDetails{
//    private static final long serialVersionUID =1L;
//
//    public SecurityUser (String username,String password,String role){
//        super();
//        this.username =username;
//    }
//
//    private  long id;
//
//    private  String username;
//
//    private  String password;
//
//    private String role;
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}
//
