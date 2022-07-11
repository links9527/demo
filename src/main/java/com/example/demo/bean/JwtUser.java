package com.example.demo.bean;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

/**
 * 实现UserDetails接口，或者同路径下User类，User类是对UserDetails接口的简易实现
 * 
 * @author jnhc
 */
@Data
public class JwtUser implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6576300753608036891L;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 权限（角色）列表
	Collection<? extends GrantedAuthority> authorities;

	public JwtUser(String stuId, String password, List<GrantedAuthority> grantedAuthorities) {
		this.username = stuId;
		this.password = password;
		this.authorities = grantedAuthorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
