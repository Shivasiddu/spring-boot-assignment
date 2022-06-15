package com.zensar.entity;



import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.Transient;



@Entity(name = " StudentInformation")
@Table(name = " StudentInfo")
//@NamedQuery(name ="abc", query =FROM StudentInformation s where s.studentName="Anu");
public class Student {
@Id
@Column(name = "Id")
@GeneratedValue(strategy = GenerationType.IDENTITY)



// TODO Auto-generated method stub
private int StudentId;



@Column(name = "name", length = 88)
private String studentName;



@Column(name = "age", nullable = false)



private int studentAge;
//@Transient
@Temporal(value = TemporalType.DATE)
private Date birthDate;
//private String tempProperty;



@OneToOne
private Department department;



public Student() {
super();
}



public Student(int studentId, String studentName, int studentAge) {
super();
StudentId = studentId;
this.studentName = studentName;
this.studentAge = studentAge;
}



public Student(int studentId, String studentName, int studentAge, Date birthDate) {
super();
StudentId = studentId;
this.studentName = studentName;
this.studentAge = studentAge;
this.birthDate = birthDate;
}



public Student(int studentId, String studentName, int studentAge, Date birthDate, Department department) {
super();
StudentId = studentId;
this.studentName = studentName;
this.studentAge = studentAge;
this.birthDate = birthDate;
this.department = department;
}



public int getStudentId() {
return StudentId;
}



public void setStudentId(int studentId) {
StudentId = studentId;
}



public String getStudentName() {
return studentName;
}



public void setStudentName(String studentName) {
this.studentName = studentName;
}



public int getStudentAge() {
return studentAge;
}



public void setStudentAge(int studentAge) {
this.studentAge = studentAge;
}



public Date getBirthDate() {
return birthDate;
}



public void setBirthDate(Date birthDate) {
this.birthDate = birthDate;
}



public Department getDepartment() {
return department;
}



public void setDepartment(Department department) {
this.department = department;
}



@Override
public String toString() {
return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
}



}