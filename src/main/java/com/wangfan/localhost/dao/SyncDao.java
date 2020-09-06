package com.wangfan.localhost.dao;

import com.wangfan.localhost.pojo.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/5/8 19:29
 */
public interface SyncDao {

    List<Visitor> queryVisitor();

    void updateVisitor(@Param("list") List<Visitor> visitors);
}
