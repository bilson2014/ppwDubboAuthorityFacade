package com.paipianwang.pat.facade.right.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 员工 角色 关系表
 * @author Jack
 * @version 2017-06-05
 *
 */
public class PmsEmployeeRoleLink extends BaseEntity {

	private static final long serialVersionUID = -8019839531165690994L;

	private long employeeId = 0l; // 员工ID
	
	private long roleId = 0l; // 角色ID

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
}
