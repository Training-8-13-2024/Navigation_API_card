package com.transformers.bottomsheettemplate.ui.profiles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.transformers.bottomsheettemplate.data.model.profile.ProfilesModel
import com.transformers.bottomsheettemplate.data.remote.profile.ProfileAPI
import kotlinx.coroutines.launch

class ProfilesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Profile Fragment"
    }
    val text: LiveData<String> = _text

    private val _profile = MutableLiveData<ProfilesModel>()
    val profiles: LiveData<ProfilesModel> = _profile


    fun getProfiles() {
        viewModelScope.launch {
            val response = ProfileAPI.retrofitProfile.getProfiles()

            _profile.value = response
        }
    }
}
