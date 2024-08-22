package com.transformers.bottomsheettemplate.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.transformers.bottomsheettemplate.R
import com.transformers.bottomsheettemplate.data.model.job.JobModel
import com.transformers.bottomsheettemplate.databinding.JobRowLayoutBinding

class JobsAdapter(private val jobsList: List<JobModel?>): RecyclerView.Adapter<JobsAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = JobRowLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.job_row_layout, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = jobsList[position]
        holder.binding.apply {
//            tvJobType.text = currentItem.salaryCurrency
//            tvCompanyName.text = currentItem.companyName
//            tvJobTitle.text = currentItem.jobTitle
            if (currentItem != null) {
                tvJobGeo.text = currentItem.jobGeo
                tvJobTitle.text = currentItem.jobTitle
                Glide.with(holder.itemView.context)
                    .load(currentItem.companyLogo)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(ivUser)
            }

        }
    }

    override fun getItemCount(): Int {
        return jobsList.size
    }


}