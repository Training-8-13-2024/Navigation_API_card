package com.transformers.bottomsheettemplate.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.transformers.bottomsheettemplate.data.model.job.JobsModel
import com.transformers.bottomsheettemplate.data.remote.job.ApiDetails
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    // LiveData -> Flows
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _jobs = MutableLiveData<JobsModel>()
    val jobs: LiveData<JobsModel> = _jobs


    fun getJobs() {
        viewModelScope.launch {
            val result = ApiDetails.retrofitJob.getJobs(
                20,
                "usa",
                "dev"
            )

            if (result.jobCount != null && result.jobCount > 0) {
                _jobs.postValue(result)
            }
        }
    }

    fun getOtherJobs(indus : String) {
        viewModelScope.launch {
            val result = ApiDetails.retrofitJob.getJobs(
                20,
                "usa",
                indus
            )

            if (result.jobCount != null && result.jobCount > 0) {
                _jobs.postValue(result)
            }
        }
    }
}