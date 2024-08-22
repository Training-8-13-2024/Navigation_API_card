package com.transformers.bottomsheettemplate.data.remote.emoji

import com.transformers.bottomsheettemplate.data.model.emoji.EmojiModelItem
import com.transformers.bottomsheettemplate.data.model.job.JobsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface EmojiApiInterface {

    @GET(ApiEmojiRetro.ENDPOINT_Emoji)
    suspend fun getEmojis(): List<EmojiModelItem>



}