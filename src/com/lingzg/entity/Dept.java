package com.lingzg.entity;

import com.lingzg.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_dept")
public class Dept extends BaseEntity {

	private static final long serialVersionUID = -8377665504560275367L;

	@Column(name = "deptno")
	private Integer deptno;
	
	@Column(name = "dname")
	private String dname;
	
	@Column(name = "loc")
	private String loc;

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
