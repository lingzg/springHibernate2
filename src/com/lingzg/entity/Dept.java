package com.lingzg.entity;

import com.lingzg.base.BaseEntity;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;

//@Entity
//@Table(name = "t_dept")
public class Dept extends BaseEntity {

	private static final long serialVersionUID = -8377665504560275367L;

	private Integer deptno;
	private String dname;
	private String loc;

	// @Column(name = "deptno")
	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	// @Column(name = "dname")
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// @Column(name = "loc")
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
