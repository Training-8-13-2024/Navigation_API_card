package com.transformers.bottomsheettemplate.data.remote.job

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails {

    //https://jobicy.com/api/v2/remote-jobs?count=15&geo=usa&industry=engineering
    const val BASE_URL = "https://jobicy.com/api/v2/"
    const val ENDPOINT_JOBS = "remote-jobs"

    val retrofitJob = Retrofit.Builder()
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
        .create(JobsApiInterface::class.java)

}