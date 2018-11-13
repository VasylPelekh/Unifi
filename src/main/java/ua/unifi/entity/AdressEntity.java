package ua.unifi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "adress")
public class AdressEntity extends BaseEntity {

	@Column(nullable = false, name = "Country")
	private String country;
	
	@Column(nullable = false, name = "Region")
	private String region;
	
	@Column(nullable = false, name = "District")
	private String district;
	
	@Column(nullable = false, name = "City")
	private String city;
	
	@Column(nullable = true, name = "Village")
	private String village;
	
	
}
