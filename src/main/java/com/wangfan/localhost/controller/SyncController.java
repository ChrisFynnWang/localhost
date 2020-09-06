package com.wangfan.localhost.controller;

import com.ejiayou.platform.common.model.ResultGenerator;
import com.wangfan.localhost.pojo.Visitor;
import com.wangfan.localhost.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2020/4/23 9:22
 */
@RestController
@RequestMapping("sync")
public class SyncController {

    @Autowired
    private SyncService syncService;

    @GetMapping
    public Object queryVisitor() {
        return syncService.queryVisitor();
    }

    @PostMapping("update")
    public Object updateVisitor(@RequestBody List<Visitor> visitors) {
        syncService.updateVisitor(visitors);
        return ResultGenerator.getSuccessObject();
    }
}
