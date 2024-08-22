package com.transformers.bottomsheettemplate.ui.settings

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.transformers.bottomsheettemplate.adapter.EmojiAdapter
import com.transformers.bottomsheettemplate.adapter.JobsAdapter
import com.transformers.bottomsheettemplate.data.model.emoji.EmojiModelItem
import com.transformers.bottomsheettemplate.databinding.FragmentEmojiBinding


class EmojiFragment : Fragment() {

    private var _binding: FragmentEmojiBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var binding : FragmentEmojiBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Emojis", "done")
        binding = FragmentEmojiBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Emojis", "done"  )
//        val _list : MutableList<EmojiModelItem> = mutableListOf()

        val emojiViewModel: EmojiViewModel by viewModels()
        emojiViewModel.emojis.observe(viewLifecycleOwner) {
            Log.d("Emojis", "done")
            binding.apply {
                emojiRecycleView.apply {
                    layoutManager = LinearLayoutManager(context)
//                    _list.add(it)
                    adapter = EmojiAdapter(it)
                }

//                txEmijo.text = it.map { it?.name }?.joinToString(",\n")
            }

        }
        emojiViewModel.getEmojis()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}