package com.jiaoye.caily.downloader.controller

import com.jiaoye.caily.downloader.dto.TaskInfoDto
import org.springframework.web.bind.annotation.*


@RequestMapping
@RestController
class Controller{

    @PostMapping("/api/downloader")
    fun submitUril(@RequestParam url : String) : String {
        return "download mission confirmed" + url
    }

    @GetMapping("/api/downloader/query")
    fun getProcess(@RequestParam taskId : String) : TaskInfoDto {
        var taskInfo = TaskInfoDto()
        taskInfo.taskId = taskId
        taskInfo.totalSize = Int.MAX_VALUE
        taskInfo.currentSize = Int.MIN_VALUE

        return taskInfo
    }

}