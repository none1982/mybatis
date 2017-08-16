package com.mybatis.model;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date joiningDate;
    private int salary;
    private String ssn;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result
		+ ((joiningDate == null) ? 0 : joiningDate.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + salary;
	result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	if (id != other.id)
	    return false;
	if (joiningDate == null) {
	    if (other.joiningDate != null)
		return false;
	} else if (!joiningDate.equals(other.joiningDate))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (salary != other.salary)
	    return false;
	if (ssn == null) {
	    if (other.ssn != null)
		return false;
	} else if (!ssn.equals(other.ssn))
	    return false;
	return true;
    }
    @Override
    public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", joiningDate="
		+ joiningDate + ", salary=" + salary + ", ssn=" + ssn + "]";
    }
    
    
    
}
