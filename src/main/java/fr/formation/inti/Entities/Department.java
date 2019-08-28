//package fr.formation.inti.Entities;
//
//import java.io.Serializable;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//
//@Table(name = "DEPARTMENT")public class Department implements Serializable {
//	
//	private String name;
//	private int deptId;
//	private Set<Employee> employees;
//	
//	public Department() {
//	}
//	
//	@OneToMany(fetch=FetchType.LAZY, mappedBy = "dept")
//	public Set<Employee> getEmployees() {return employees;}
//	public void setEmployees(Set<Employee> employees) {this.employees = employees;}
//	
//	@Column(name = "NAME", length = 20, nullable= false)
//	public String getName() {return name;}
//	public void setName(String name) {this.name = name;}
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "DEPT_ID")
//	public int getDept_id() {return deptId;}
//	public void setDept_id(int dept_id) {this.deptId = dept_id;}
//	
//}
