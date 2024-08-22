package com.transformers.bottomsheettemplate.data.remote.job

import com.transformers.bottomsheettemplate.data.model.job.JobsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface JobsApiInterface {

    //count=15&geo=usa&industry=engineering
    @GET(ApiDetails.ENDPOINT_JOBS)
    suspend fun getJobs(
        @Query("count") count: Int = 15,
        @Query("geo") geo: String = "usa",
        @Query("industry") industry: String = "engineering"
    ): JobsModel

}