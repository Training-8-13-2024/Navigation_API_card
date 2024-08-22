package com.transformers.bottomsheettemplate.data.remote.profile

import com.transformers.bottomsheettemplate.data.model.job.JobsModel
import com.transformers.bottomsheettemplate.data.model.profile.ProfilesModel
import com.transformers.bottomsheettemplate.data.remote.job.ApiDetails
import retrofit2.http.GET
import retrofit2.http.Query

interface ProfileApiInterface {


    //https://randomuser.me/api/?results=50
    @GET(ProfileAPI.ENDPOINT_PROFILE)
    suspend fun getProfiles(): ProfilesModel

}