package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "Manager")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Manager extends Base_Entity {
	
	@Column(name="first_name",length = 30)
	private String firstName;
	@Column(name="last_name",length = 30)
	private String lastName;
	@Column(length = 30,unique = true) 
	private String email;
	@Column(length=50, nullable = true)
	private String pass;
//	@Transient //skip from persistence (i.e no col will be generated)
//	private String confirmPassword;
	@Column(name="join_date")
	private LocalDate joinDate;
	@Enumerated(EnumType.STRING) 
	@Column(length = 30,name="Position")
	private Position Position; 
	@Column(nullable = true)
	private double salary;//auto adds NOT NULL constraint
	
	@OneToMany(mappedBy = "manager_id",cascade = CascadeType.ALL,
			orphanRemoval = true ,fetch=FetchType.EAGER )
	private List<Sprint> sprint_list = new ArrayList<>();

	@Override
	public String toString() {
		return "Manager [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email  + ", joinDate=" + joinDate + ", Position=" + Position + ", salary=" + salary
				+ ", sprint_list=" + sprint_list + "]";
	}

	

}
