package com.wangfan.localhost.service.impl;

import com.wangfan.localhost.dao.SyncDao;
import com.wangfan.localhost.pojo.Visitor;
import com.wangfan.localhost.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/5/8 19:29
 */
@Service
public class SyncServiceImpl implements SyncService {

    @Autowired
    private SyncDao syncDao;

    @Override
    public Object queryVisitor() {

        return syncDao.queryVisitor();
    }

    @Override
    public void updateVisitor(List<Visitor> visitors) {
        syncDao.updateVisitor(visitors);
    }
}
