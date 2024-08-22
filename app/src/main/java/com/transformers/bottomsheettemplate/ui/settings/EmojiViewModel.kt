package com.transformers.bottomsheettemplate.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.transformers.bottomsheettemplate.data.model.emoji.EmojiModelItem
import com.transformers.bottomsheettemplate.data.model.job.JobsModel
import com.transformers.bottomsheettemplate.data.remote.emoji.ApiEmojiRetro
import com.transformers.bottomsheettemplate.data.remote.job.ApiDetails
import kotlinx.coroutines.launch

class EmojiViewModel: ViewModel(){

    // LiveData -> Flows
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _emojis = MutableLiveData<List<EmojiModelItem>>()
    val emojis: LiveData<List<EmojiModelItem>> = _emojis


    fun getEmojis() {
        viewModelScope.launch {
            val result = ApiEmojiRetro.retrofitEmoji.getEmojis()

            _emojis.postValue(result)

        }
    }
}