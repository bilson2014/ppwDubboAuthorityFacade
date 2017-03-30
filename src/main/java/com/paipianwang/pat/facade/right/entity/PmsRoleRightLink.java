package com.paipianwang.pat.facade.right.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 角色和权限关系实体类
 * @author Jack
 *
 */
public class PmsRoleRightLink extends BaseEntity{

	private static final long serialVersionUID = 6994838028956282908L;

	/**
	 * 角色实体
	 */
	private PmsRole role = null;
	
	/**
	 * 权限实体
	 */
	private PmsRight right = null;

	public PmsRole getRole() {
		return role;
	}

	public void setRole(PmsRole role) {
		this.role = role;
	}

	public PmsRight getRight() {
		return right;
	}

	public void setRight(PmsRight right) {
		this.right = right;
	}
	
}
