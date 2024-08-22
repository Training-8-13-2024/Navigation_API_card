package com.transformers.bottomsheettemplate.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.transformers.bottomsheettemplate.R
import com.transformers.bottomsheettemplate.data.model.profile.ProfileModel
import com.transformers.bottomsheettemplate.databinding.ProfileRowLayoutBinding


class UserAdapter(private val profilesList: List<ProfileModel>): RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ProfileRowLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_row_layout, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = profilesList[position]
        holder.binding.apply {
//            tvJobType.text = currentItem.salaryCurrency
//            tvCompanyName.text = currentItem.companyName
//            tvJobTitle.text = currentItem.jobTitle
            tvProfileEmail.text = currentItem.email
            tvProfileCountry.text = currentItem.name
        }
    }

    override fun getItemCount(): Int {
        return profilesList.size
    }


}