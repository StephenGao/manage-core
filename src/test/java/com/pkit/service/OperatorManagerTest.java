package com.pkit.service;

import com.pkit.BaseTest;
import com.pkit.common.Page;
import com.pkit.dao.OperatorDao;
import com.pkit.model.Operator;
import com.pkit.util.DataType;
import com.pkit.vo.OperatorQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperatorManagerTest extends BaseTest {

   @Autowired
   private OperatorManager operatorManager;

   @Test
   public void testFindById(){
       Operator operator=(Operator)operatorManager.findById(1l);
       System.out.println("loginName:"+operator.getLoginName());
   }


    @Test
    public void testFindByQuery(){
        OperatorQuery operatorQuery=new OperatorQuery();
        operatorQuery.setLoginName("zhangxp");
        Operator operator=(Operator)operatorManager.findByQuery(operatorQuery);
        System.out.println("loginName:"+operator.getId());
    }


    @Test
    public void testFindPage(){
        OperatorQuery operatorQuery=new OperatorQuery();
        operatorQuery.setPageSize(1);
        operatorQuery.setPageNumber(3);
        Page<Operator> pages=operatorManager.findPage(operatorQuery);
        System.out.println("rows:"+pages.getRows());
    }


    @Test
    public void testSaveOrUpdate(){
        Operator operator=(Operator)operatorManager.findById(1l);
        operator.setAge(11);
        boolean isSuccess=operatorManager.saveOrUpdate(operator);
        System.out.println("isSuccess:"+isSuccess);
    }

    @Test
    public void testSave(){
        Operator operator=new Operator();
        operator.setLoginName("aa");
        operator.setCreateTime(new Date());
        Object obj=operatorManager.save(operator);
        System.out.println("save ret:"+obj);
    }

    @Test
    public void testSaveBatch(){
        List<Operator> list=new ArrayList<Operator>();
        for(int i=0;i<10;i++){
            Operator operator=new Operator();
            operator.setLoginName("saveBatch"+i);
            list.add(operator);
        }
        Object obj=operatorManager.saveBatch(list);
        System.out.println("SaveBatch ret:"+obj);
    }

    @Test
    public void testUpdate(){
        Operator operator=new Operator();
        operator.setId(4L);
        operator.setLoginName("update");
        Object obj=operatorManager.update(operator);
        System.out.println("update ret:"+obj);
    }


    @Test
    public void testUpdateBatch(){
        List<Operator> list=new ArrayList<Operator>();
        for(int i=6;i<10;i++){
            Operator operator=new Operator();
            operator.setId(DataType.getLong(i));
            operator.setLoginName("updateBatch"+i);
            list.add(operator);
        }
        Object obj=operatorManager.updateBatch(list);
        System.out.println("updateBatch ret:"+obj);
    }



    @Test
    public void testDeleteByIds(){
        List ids=new ArrayList();
        ids.add("6");
        ids.add("7");
        Object obj=operatorManager.deleteByIds(ids);
        System.out.println("deleteByIds ret:"+obj);
    }

    @Test
    public void testDeleteById(){
        Object obj=operatorManager.deleteById(5L);
        System.out.println("deleteById ret:"+obj);
    }

    @Test
    public void testSave1(){
        Operator operator=new Operator();
        operator.setLoginName("11111");
        operator.setCreateTime(new Date());
        operatorManager.save1(operator);
    }
}