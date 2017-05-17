package com.paipianwang.pat.facade.right.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.common.entity.SessionInfo;
import com.paipianwang.pat.facade.right.entity.PmsRight;
import com.paipianwang.pat.facade.right.entity.PmsTree;

/**
 * 权限接口
 */
public interface PmsRightFacade {

	/**
	 * 获取所有权限集合
	 * @return 权限集合
	 */
	public List<PmsRight> findAllRights();
	
	public DataGrid<PmsRight> listWithPagination(PageParam param, Map<String, Object> paramMap);
	
	/**
	 * 根据权限ID查询权限实体
	 * @param rightId 权限ID
	 * @return
	 */
	public PmsRight findRightById(final long rightId);
	
	/**
	 * 保存权限实体，不需要计算权限位和权限码
	 * @param right 权限实体
	 * @return
	 */
	public long save(final PmsRight right);
	
	/**
	 * 根据权限ID，更新权限实体
	 * @param right
	 * @return
	 */
	public long update(final PmsRight right);
	
	/**
	 * 批量删除
	 * @param ids 权限ID数组
	 * @return
	 */
	public long deleteByIds(final long[] ids);
	
	/**
	 * 权限树型展示
	 * @return 权限树集合
	 */
	public List<PmsTree> resourceTree();

	/**
	 * 查询权限集合
	 * url作为Map的key值，right作为value
	 * @return Map<String, PmsRight>
	 */
	public Map<String, PmsRight> getRightsMergeMap();

	/**
	 * 获取最大权限位
	 * @return 最大权限位
	 */
	public long getMaxPos();

	/**
	 * 根据当前登录者身份，加载相应权限的菜单
	 * @param request
	 * @return
	 */
	public List<PmsTree> menu(final SessionInfo info);

	/**
	 * 根据url 作为key值，从 Redis 获取 权限实体
	 * @param uri key值
	 * @return
	 */
	public PmsRight getRightFromRedis(String uri);

	/**
	 * 根据角色ID，查询权限ID数组
	 * @param roleId 角色ID
	 * @return
	 */
	public List<Long> findRightsByRole(long roleId);
	
	/**
	 * 更新 Redis 中的权限集合
	 * @param map 权限集合
	 */
	public void resetRightOnRedis(final Map<String, PmsRight> map);
	
	/**
	 * 新增/更新 Redis 中的单条权限记录
	 * @param right
	 */
	public void addRightByRedis(PmsRight right);
}
