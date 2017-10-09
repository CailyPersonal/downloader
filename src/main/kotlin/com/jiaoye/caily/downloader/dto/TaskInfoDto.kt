package com.jiaoye.caily.downloader.dto

import lombok.Data

@Data
class TaskInfoDto {

    private var taskId : String? = null
    private var totalSize : Int = Int.MAX_VALUE
    private var currentSize : Int = 0

}