package com.paipianwang.pat.facade.right.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.right.entity.PmsEmployee;

public interface PmsEmployeeFacade {

	public PmsEmployee doLogin(final String loginName,final String password);

	public long checkPhoneNumber(final String phoneNumber);

	public List<PmsEmployee> getEmployeesWithVersionManager(final String phoneNumber);

	public long editPasswordById(final PmsEmployee originalEmployee);
	/**
	 * 获取项目协同人 目前业务规则:协同人身份为视频管家和视频管家指导
	 * 
	 * @return employeeList
	 */
	public List<PmsEmployee> findEmployeeToSynergy();
	/**
	 * 根据条件分页显示员工信息
	 * 
	 * @param view
	 *            条件
	 * @return 员工列表
	 */
	public DataGrid<PmsEmployee> listWithPagination(Map<String, Object> paramMap, PageParam pageParam);

	public long save(final PmsEmployee employee);

	public long updateImagePath(final PmsEmployee employee);

	public PmsEmployee findEmployerById(final long employeeId);

	public void updateWidthRelation(final PmsEmployee employee);



}
