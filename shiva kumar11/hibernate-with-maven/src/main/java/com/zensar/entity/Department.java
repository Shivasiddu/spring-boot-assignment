package com.zensar.entity;



import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;



@Embeddable
@Entity
public class Department {
@Id
private int departmentId;

private String departmentName;



public Department() {
super();
}



public Department(int departmentId, String departmentName) {
super();
this.departmentId = departmentId;
this.departmentName = departmentName;
}



public int getDepartmentId() {
return departmentId;
}



public void setDepartmentId(int departmentId) {
this.departmentId = departmentId;
}



public String getDepartmentName() {
return departmentName;
}



public void setDepartmentName(String departmentName) {
this.departmentName = departmentName;
}



@Override
public String toString() {
return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
}





}