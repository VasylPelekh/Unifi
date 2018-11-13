package ua.unifi.entity;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	
	@Column(nullable = false, name = "First Name")
	private String firstName;
	
	@Column(nullable = false, name = "Last Name")
	private String lastName;
	
	@Column(nullable = false, name = "Sur Name")
	private String surName;
	
	
	private int age;
	
	@Enumerated(EnumType.STRING)
	private SexType sex;
	
	@Column(nullable = false, name = "Adress")
	private String adress;
	
	@Column(nullable = false, name = "Education")
	private String education;
	
	@Column(nullable = false, name = "Family")
	private List<?> family;
	
	@Column(nullable = true)
	private String pfoto;
	
	@Column(nullable = false, name = "Email")
	private List<String> email;
	
	@Column(nullable = false, name = "Phone Number")
	private List<String> phoneNumber;
	
	
	
	
	
}
