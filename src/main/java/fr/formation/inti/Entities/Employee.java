//package fr.formation.inti.Entities;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//
//
//public class Employee implements Serializable {
//	private int empId;
//	private Employee manager;
//	private String first_name, last_name, title;
//	private Date start_date, end_date;
//	private Department dept;
//	private List <Employee> list = new ArrayList<Employee>();
//	public Employee() {
//		// constructor
//	}
//	
//	@OneToMany
//	public List<Employee> getList() {
//		return list;
//	}
//
//	public void setList(List<Employee> list) {
//		this.list = list;
//	}
//
//	public Employee(int emp_id, Date end_date, String first_name, String last_name, Date start_date, String title,
//			Department dept, Employee manager) {
//		super();
//		this.empId = emp_id;
//		this.manager = manager;
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.title = title;
//		this.start_date = start_date;
//		this.end_date = end_date;
//		this.dept = dept;
//	}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "EMP_ID")
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "SUPERIOR_EMP_ID")
//	public Employee getManager() {
//		return manager;
//	}
//
//	
//	public void setManager(Employee manager) {
//		this.manager = manager;
//	}
//
//	@Column(name = "FIRST_NAME", length = 20, nullable = false)
//	public String getFirst_name() {
//		return first_name;
//	}
//
//	public void setFirst_name(String first_name) {
//		this.first_name = first_name;
//	}
//
//	@Column(name = "LAST_NAME", length = 20, nullable = false)
//	public String getLast_name() {
//		return last_name;
//	}
//
//	public void setLast_name(String last_name) {
//		this.last_name = last_name;
//	}
//
//	@Column(name = "TITLE", length = 20)
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	@Column(name = "START_DATE", length = 20, nullable = false)
//	public Date getStart_date() {
//		return start_date;
//	}
//
//	public void setStart_date(Date start_date) {
//		this.start_date = start_date;
//	}
//
//	@Column(name = "END_DATE", length = 20)
//	public Date getEnd_date() {
//		return end_date;
//	}
//
//	public void setEnd_date(Date end_date) {
//		this.end_date = end_date;
//	}
//
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "DEPT_ID", nullable = true, foreignKey = @ForeignKey(name ="EMPLOYEE_DEPARTMENT_FK"))
//	public Department getDept() {
//		return dept;
//	}
//
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [emp_id=" + empId + ", first_name=" + first_name + ", last_name=" + last_name
//				+ ", start_date=" + start_date + "]";
//	}
//
//}