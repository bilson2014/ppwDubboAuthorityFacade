package com.paipianwang.pat.facade.right.service;

import com.paipianwang.pat.facade.right.entity.PmsRight;

/**
 * 权限接口
 */
public interface PmsRightFacade {

	public long getMaxPos();

	public PmsRight getRightFromRedis(final String uri);




}
