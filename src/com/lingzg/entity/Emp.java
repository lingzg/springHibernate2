package com.lingzg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.lingzg.base.BaseEntity;

@Entity
@Table(name = "t_emp")
public class Emp extends BaseEntity {

	private static final long serialVersionUID = 2629767723662399783L;

	@Column(name = "empno")
	private Integer empno;
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name = "job")
	private String job;
	
	@Column(name = "mgr")
	private Integer mgr;
	
	@Column(name = "hiredate")
	private Date hiredate;
	
	@Column(name = "sal")
	private Double sal;
	
	@Column(name = "comm")
	private Double comm;
	
	@Column(name = "deptno")
	private Integer deptno;

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

}
