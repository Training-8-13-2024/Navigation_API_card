package com.transformers.bottomsheettemplate.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.transformers.bottomsheettemplate.R
import com.transformers.bottomsheettemplate.data.model.emoji.EmojiModelItem
import com.transformers.bottomsheettemplate.databinding.EmojiRowLayoutBinding

class EmojiAdapter(private val emojisList: List<EmojiModelItem?>): RecyclerView.Adapter<EmojiAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = EmojiRowLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.emoji_row_layout, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = emojisList[position]
        holder.binding.apply {
//            tvJobType.text = currentItem.salaryCurrency
//            tvCompanyName.text = currentItem.companyName
//            tvJobTitle.text = currentItem.jobTitle
            if (currentItem != null) {
                tvEcategory.text = currentItem.category
            }
            if (currentItem != null) {
                tvEName.text = StringBuilder()
                    .appendCodePoint(
                        Integer.decode(
                            currentItem.unicode[0].replace("U+", "0x")
                        )
                    )
                    .toString()
            }
        }
    }

    override fun getItemCount(): Int {
        return emojisList.size
    }


}