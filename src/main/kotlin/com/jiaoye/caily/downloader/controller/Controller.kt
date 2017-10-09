package com.jiaoye.caily.downloader.controller

import com.jiaoye.caily.downloader.dto.TaskInfoDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping
@RestController
class Controller{

    @PostMapping("/api/downloader")
    fun submitUril(url : String) : String {
        return "download mission confirmed" + url
    }

    @GetMapping("/api/downloader/query")
    fun getProcess(taskId : String) : TaskInfoDto {
        TODO("return task info")
    }

}