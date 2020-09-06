package com.wangfan.localhost.service;

import com.wangfan.localhost.pojo.Visitor;

import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/5/8 19:29
 */
public interface SyncService {

    Object queryVisitor();

    void updateVisitor(List<Visitor> visitors);
}
