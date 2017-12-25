package com.yan.demo.bean;

public class Employee {
    private Integer empId;

    private String empName;

    private String sex;

    private String email;

    private Integer deptId;
    
    //查询员工的同时部门信息也是查询好的
    private Department department;
    
    
    
    public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, String sex, String email, Integer deptId ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sex = sex;
		this.email = email;
		this.deptId = deptId;
	}

	public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}