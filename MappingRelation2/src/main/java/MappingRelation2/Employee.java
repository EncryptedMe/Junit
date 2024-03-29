package MappingRelation2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private Integer employeeId;

 
    @Column(name = "NAME", unique = false, nullable = false, length = 100)
    private String Name;

	public Employee(Integer employeeId, String Name) {
		this.employeeId = employeeId;
		this.Name = Name;
	}
	public Employee() {}	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
    @ManyToOne
    private Department department;

}
