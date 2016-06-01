package com.pkit.dao;

import com.pkit.common.BaseIbatis3Dao;
import com.pkit.model.Operator;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaoping on 2016/5/3.
 */
@Repository
public class OperatorDao extends BaseIbatis3Dao<Operator,Long> {

    @Override
    public String getIbatisMapperNamesapce() {
        return Operator.class.getSimpleName();
    }

    @Override
    public int saveOrUpdate(Operator entity) {
        int count=0;
        if(entity.getId() == null)
            count=(Integer)save(entity);
        else
            count=update(entity);
        return count;
    }



}
