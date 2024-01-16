package com.thangnguyen.voctracker.bean;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
public class AppUser {
	
	@Id
	@Column(name ="domainname", unique=true)
	private String domainName;
	
	@Column(name ="username")
	private String userName;
	
	@JsonIgnore
	@Column(name ="password")
	private String  password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
			name="user_role_junction",
			joinColumns = {@JoinColumn(name="domainName")},
			inverseJoinColumns = {@JoinColumn(name="role_id")}
	)
	
	private Set<Role> authorities;
	
	public AppUser() {
		this.authorities = new HashSet<>();
	}
}
