package com.transformers.bottomsheettemplate.data.remote.emoji

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiEmojiRetro {

    //https://emojihub.yurace.pro/api/all
    const val BASE_URL = "https://emojihub.yurace.pro/api/"
    const val ENDPOINT_Emoji = "all"

    val retrofitEmoji = Retrofit.Builder()
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
        .create(EmojiApiInterface::class.java)

}