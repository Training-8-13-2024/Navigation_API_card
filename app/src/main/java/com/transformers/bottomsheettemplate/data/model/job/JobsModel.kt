package com.transformers.bottomsheettemplate.data.model.job


import com.google.gson.annotations.SerializedName

data class JobsModel(
    @SerializedName("apiVersion")
    val apiVersion: String? = "",
    @SerializedName("clientKey")
    val clientKey: String? = "",
    @SerializedName("documentationUrl")
    val documentationUrl: String? = "",
    @SerializedName("friendlyNotice")
    val friendlyNotice: String? = "",
    @SerializedName("jobCount")
    val jobCount: Int? = 0,
    @SerializedName("jobs")
    val jobs: List<JobModel?>? = listOf(),
    @SerializedName("lastUpdate")
    val lastUpdate: String? = "",
    @SerializedName("xRayHash")
    val xRayHash: String? = ""
)