package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Sprint")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sprint extends Base_Entity{
	@Column
	private String Domain;
	@Column
	private String Priority;
	@Column(name="Deadline")
	private LocalDate Last_date_to_submit;
	@Column(length = 30,name="No_of_employees")
	private int number_emp;
    // many sprint to one manager
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Manager manager_id;
	
	@OneToMany(mappedBy = "sprint_id",cascade = CascadeType.ALL,
			orphanRemoval = true ,fetch=FetchType.EAGER )
	private List<Sprint_entry> Sprint_entries_list = new ArrayList<>();

	@Override
	public String toString() {
		return "Sprint [Domain=" + Domain + ", Priority=" + Priority + ", Last_date_to_submit=" + Last_date_to_submit
				+ ", number_emp=" + number_emp + "]";
	}

	

}
