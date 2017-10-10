package com.jiaoye.caily.downloader.service.impl

import com.jiaoye.caily.downloader.model.TaskInfo
import com.jiaoye.caily.downloader.service.TaskReadService
import org.springframework.stereotype.Service

@Service
class TaskReadServiceImpl : TaskReadService {
    override fun findByTaskId(taskId: String): TaskInfo {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findById(id: Int): TaskInfo {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}