package com.transformers.bottomsheettemplate.data.remote.profile

import com.transformers.bottomsheettemplate.data.remote.job.JobsApiInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProfileAPI {


    //https://randomuser.me/api/?results=50
    const val BASE_URL = "https://randomuser.me/api/"
    const val ENDPOINT_PROFILE = "?results=50"

    val retrofitProfile = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
                .build()
        )
        .build()
        .create(ProfileApiInterface::class.java)

}