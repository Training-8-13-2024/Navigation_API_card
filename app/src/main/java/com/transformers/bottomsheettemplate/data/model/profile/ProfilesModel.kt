package com.transformers.bottomsheettemplate.data.model.profile


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ProfilesModel(
    @SerializedName("info")
    val info: String,
    @SerializedName("results")
    val profileModels: List<ProfileModel>
)