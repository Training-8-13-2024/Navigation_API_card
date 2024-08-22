package com.transformers.bottomsheettemplate.data.model.profile


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ProfileModel(
    @SerializedName("cell")
    
    val cell: String,
    @SerializedName("dob")
    
    val dob: String,
    @SerializedName("email")
    
    val email: String,
    @SerializedName("gender")
    
    val gender: String,
    @SerializedName("id")
    
    val id: String,
    @SerializedName("location")
    
    val location: String,
    @SerializedName("login")
    
    val login: String,
    @SerializedName("name")
    
    val name: String,
    @SerializedName("nat")
    
    val nat: String,
    @SerializedName("phone")
    
    val phone: String,
    @SerializedName("picture")
    
    val picture: String,
    @SerializedName("registered")
    
    val registered: String
)