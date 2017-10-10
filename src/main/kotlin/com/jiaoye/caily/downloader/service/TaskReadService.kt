package com.jiaoye.caily.downloader.service

import com.jiaoye.caily.downloader.model.TaskInfo

interface TaskReadService {

    fun findByTaskId(taskId : String) : TaskInfo

    fun findById(id : Int) : TaskInfo
}