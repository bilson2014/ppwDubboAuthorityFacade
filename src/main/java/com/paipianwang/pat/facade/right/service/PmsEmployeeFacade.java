package com.paipianwang.pat.facade.right.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.right.entity.PmsEmployee;

/**
 * 内部员工数据接口
 * @version 2017-03-30
 * @author Jack
 *
 */
public interface PmsEmployeeFacade {

	/**
	 * 更新内部员工实体
	 * 
	 * @param pmsEmployee
	 *            员工实体
	 * @return
	 */
	public long update(PmsEmployee pmsEmployee);

	/**
	 * 根据员工ID数组，删除员工以及员工与角色之间的关系
	 * 
	 * @param ids
	 *            员工ID数组
	 * @return
	 */
	public long delete(long[] ids);

	/**
	 * 登陆信息验证
	 * 
	 * @param loginName
	 *            登录名
	 * @param password
	 *            密码(MD5加密)
	 * @return 带有角色的员工实体
	 */
	public PmsEmployee doLogin(final String loginName, final String password);

	/**
	 * 检测手机的唯一性
	 * 
	 * @param phoneNumber
	 *            手机号码
	 * @return 返回存在手机号码员工实体集合
	 */
	public long checkPhoneNumber(final String phoneNumber);

	/**
	 * 根据员工真实姓名，获取角色为视频管家的员工集合
	 * 
	 * @param employeeRealName
	 *            员工真实姓名
	 * @return
	 */
	public List<PmsEmployee> findEmployeeByRealNameWithinVersionManager(String employeeRealName);

	/**
	 * 获取内部员工集合（不包含admin及测试帐号）
	 * 
	 * @return
	 */
	public List<PmsEmployee> findEmployeeList();

	/**
	 * 根据员工ID，修改员工
	 * 
	 * @param originalEmployee
	 * @return
	 */
	public long updatePwdById(final PmsEmployee originalEmployee);

	/**
	 * 获取项目协同人 目前业务规则:协同人身份为视频管家和视频管家指导
	 * 
	 * @return 员工集合（员工信息包含员工ID、员工名称）
	 */
	public List<PmsEmployee> findEmployeeToSynergy();

	/**
	 * 根据条件分页显示员工信息
	 * 
	 * @param paramMap
	 *            条件集合
	 * @param pageParam
	 *            分页实体
	 * @return 员工列表
	 */
	public DataGrid<PmsEmployee> listWithPagination(Map<String, Object> paramMap, PageParam pageParam);

	/**
	 * 保存员工信息
	 * 
	 * @param employee
	 *            员工实体
	 * @return
	 */
	public long save(final PmsEmployee pmsEmployee);

	/**
	 * 更新员工头像
	 * 
	 * @param photoPath
	 *            头像地址
	 * @return
	 */
	public long updateImagePath(final PmsEmployee employee);

	/**
	 * 根据员工ID，查询员工信息
	 * 
	 * @param employeeId
	 * @return
	 */
	public PmsEmployee findEmployeeById(final long employeeId);

	/**
	 * 更新员工与角色之间的关系
	 * 
	 * @param employee
	 *            员工
	 */
	public void updateWidthRelation(final PmsEmployee employee);

	/**
	 * 根据手机号码，查询角色为视频管家的员工集合
	 * 
	 * @param phoneNumber
	 *            手机号码
	 * @return
	 */
	public List<PmsEmployee> getEmployeesWithinVersionManager(final String phoneNumber);

	/**
	 * 检测三方登录是否已经绑定
	 * 
	 * @param employee
	 *            员工信息
	 * @return
	 */
	public List<PmsEmployee> verificationEmployeeExist(PmsEmployee employee);

	/**
	 * 根据角色，查询员工列表
	 * 
	 * @param roleId
	 *            角色名称
	 * @return
	 */
	public List<PmsEmployee> findEmployeesByRoleId(Long roleId);

	/**
	 * 根据员工ID数组，查询员工列表
	 * 
	 * @param roleIds
	 *            员工ID数组
	 * @return
	 */
	public List<PmsEmployee> findEmployeeByIds(Long[] employeeIds);
	
	/**
	 * 根据手机号码，查询员工列表
	 * @param phoneNumber 手机号码
	 * @return 员工列表
	 */
	public List<PmsEmployee> findEmployeesByPhoneNumber(String phoneNumber);
	
	/**
	 * 根据员工ID，更新三方登录的唯一编码
	 * @param employee 员工信息
	 * @return 
	 */
	public long updateUniqueId(PmsEmployee employee);
	
	/**
	 * 根据角色名字获取员工列表
	 * @param roleList
	 * @return
	 */
	public List<PmsEmployee> findEmployeeByRoleName(List<String> roleNameList);
	
	/**
	 * 根据角色名ID取员工列表
	 * @param roleList
	 * @return
	 */
	public List<PmsEmployee> findEmployeeByRoleId(List<Long> roleIdList);
	
	/**
	 * 根据条件获取员工
	 * @param paramMap
	 * @return
	 */
	public List<PmsEmployee> findEmployeeByCondition(Map<String, Object> paramMap);
	
}
