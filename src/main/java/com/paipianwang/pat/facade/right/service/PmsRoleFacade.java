package com.paipianwang.pat.facade.right.service;

import java.util.List;

import com.paipianwang.pat.facade.right.entity.PmsRole;


/**
 * 角色接口
 */
public interface PmsRoleFacade {

	/**
	 * 查询员工的角色信息，不含权限
	 * @param employeeId
	 * @return
	 */
	public List<PmsRole> getRolesByEmployId(final long employeeId);
	/**
	 * 查询员工的角色信息 权限信息
	 */
	public PmsRole findRoleById(final long roleId);



}
