
package com.pkit.service;

import com.pkit.common.BaseManager;
import com.pkit.common.EntityDao;
import org.springframework.stereotype.Service;


import com.pkit.model.*;
import com.pkit.dao.*;


@Service
public class OperatorManager extends BaseManager<Operator,Long> {

	private OperatorDao operatorDao;

	public void setOperatorDao(OperatorDao dao) {
		this.operatorDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.operatorDao;
	}


	public void save1(Operator operator){
		operatorDao.deleteById(17L);
		operatorDao.save(operator);
	}
}
