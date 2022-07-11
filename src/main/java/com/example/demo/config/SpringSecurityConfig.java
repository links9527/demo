package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
	@Bean
	UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager users = new InMemoryUserDetailsManager();
		users.createUser(User.withUsername("lks").password("{noop}123").roles("admin").build());
		users.createUser(User.withUsername("江南一点雨").password("{noop}123").roles("admin").build());
		return users;
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().permitAll().and().csrf().disable();
		return http.build();

//	        return http.csrf().disable()
//	                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//	                .and()
//	                .authorizeRequests()
//	                .antMatchers("/user/login").anonymous()
//	                .anyRequest().authenticated()
//	                .and()
//	                .addFilterBefore(jwtAuthenticationTokenFilter,UsernamePasswordAuthenticationFilter.class)
//	                .build();
	}
//    @Autowired
//    private CustomUserDetailsService customUserDetailsService; // 该类实现UserDetailsServer接口，重写loadUserByUsername方法，从数据库获取用户名，密码，角色

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.userDetailsService(customUserDetailsService).passwordEncoder(new PasswordEncoder() {
////			@Override
////			public String encode(CharSequence charSequence) {
////				return charSequence.toString();
////			}
////
////			@Override
////			public boolean matches(CharSequence charSequence, String s) {
////				return s.equals(charSequence.toString());
////			}
////		});
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login")
//				.defaultSuccessUrl("/").permitAll().and().logout().permitAll();
//		http.csrf().disable();
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//
//		web.ignoring().antMatchers("/css/**", "/js/**");
//	}
}
