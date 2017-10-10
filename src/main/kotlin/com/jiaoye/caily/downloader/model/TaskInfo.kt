package com.jiaoye.caily.downloader.model

import lombok.Data

@Data
class TaskInfo {

    private var id : Int? = null
    private var taskId : String? = null
    private var totalSize : Int? = null
    private var currentSize : Int? = null

}