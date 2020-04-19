package com.template.nanamare.data.source.impl

import com.template.nanamare.data.network.response.VideoResponse
import io.reactivex.Single
import retrofit2.Response

interface VideoDataSource {
    fun getMovieVideos(movieId: Int) : Single<Response<VideoResponse>>
}