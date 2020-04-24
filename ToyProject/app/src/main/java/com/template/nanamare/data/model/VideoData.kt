package com.template.nanamare.data.model

import com.template.nanamare.data.network.response.BaseResponse

data class VideoData(
    val id: Int,
    val results: List<ResultData>
) : BaseResponse
