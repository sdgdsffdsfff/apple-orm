/*
 * IDirtyLoadableEntity.java
 *
 * 深圳广联赛讯有限公司
 *
 * Copyright (C) 2012 WONDERSHARE.COM
 *
 * All Right reserved
 * http://www.glsx.com.cn
 */
package com.appleframework.orm.hibernate.model.base;

/**
 * Implementation of this interfaces means that entity can be loaded in a
 * lazy(dirty) way.
 * 
 * @author Cruise.Xu
 * @date: 2011-9-8
 * 
 */
public interface IDirtyLoadableEntity {
	
	/**
	 * forces entity to be loaded, all necessary fields are getting loaded after
	 * execution of this method.
	 */
	void forceAttributesLoad();

	/**
	 * @return true if entity is dirty loaded, not a proxy. else false.
	 */
	boolean attributesLoaded();
}
