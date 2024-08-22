package com.transformers.bottomsheettemplate.data.model.job


import com.google.gson.annotations.SerializedName

data class JobModel(
    @SerializedName("annualSalaryMax")
    val annualSalaryMax: String? = "",
    @SerializedName("annualSalaryMin")
    val annualSalaryMin: String? = "",
    @SerializedName("companyLogo")
    val companyLogo: String? = "",
    @SerializedName("companyName")
    val companyName: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("jobDescription")
    val jobDescription: String? = "",
    @SerializedName("jobExcerpt")
    val jobExcerpt: String? = "",
    @SerializedName("jobGeo")
    val jobGeo: String? = "",
    @SerializedName("jobIndustry")
    val jobIndustry: List<String?>? = listOf(),
    @SerializedName("jobLevel")
    val jobLevel: String? = "",
    @SerializedName("jobSlug")
    val jobSlug: String? = "",
    @SerializedName("jobTitle")
    val jobTitle: String? = "",
    @SerializedName("jobType")
    val jobType: List<String?>? = listOf(),
    @SerializedName("pubDate")
    val pubDate: String? = "",
    @SerializedName("salaryCurrency")
    val salaryCurrency: String? = "",
    @SerializedName("url")
    val url: String? = ""
)