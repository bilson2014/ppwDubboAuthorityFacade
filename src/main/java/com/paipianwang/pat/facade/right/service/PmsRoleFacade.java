package com.paipianwang.pat.facade.right.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
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
	public List<PmsRole> findRolesByEmployId(final long employeeId);
	/**
	 * 查询员工的角色信息 权限信息
	 */
	public PmsRole findRoleById(final long roleId);

	/**
	 * 获取所有角色
	 * @return 角色集合
	 */
	public List<PmsRole> findAllRoles();
	
	/**
	 * 分页查询角色信息
	 * @param pageBean 分页实体
	 * @param param 条件实体
	 * @return DataGrid<PmsRole>
	 */
	public DataGrid<PmsRole> listWithPagination(PageParam pageParam,Map<String, Object> param);
	
	/**
	 * 保存角色实体
	 * @param role 角色实体
	 * @return
	 */
	public long save(PmsRole role);
	
	/**
	 * 更新角色实体
	 * @param role 新角色实体
	 * @return
	 */
	public long update(PmsRole role);
	
	/**
	 * 根据角色ID，批量删除
	 * 该删除会删除与角色相关的权限、内部员工之间的关系
	 * @param ids 角色ID数组
	 * @return
	 */
	public long deleteByIds(long[] ids);
	
	/**
	 * 角色授权操作
	 * 该操作会先删除角色与权限之前的关系，然后再建立新的关系
	 * @param roleId 角色ID
	 * @param resourceIds 权限ID
	 * @return
	 */
	public long grant(Long roleId, long[] rightIds);


}
