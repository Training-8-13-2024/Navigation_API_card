package com.transformers.bottomsheettemplate.data.model.emoji


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class EmojiModelItem(
    @SerializedName("category")
    @Expose
    val category: String,
    @SerializedName("group")
    @Expose
    val group: String,
    @SerializedName("htmlCode")
    @Expose
    val htmlCode: List<String>,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("unicode")
    @Expose
    val unicode: List<String>
)