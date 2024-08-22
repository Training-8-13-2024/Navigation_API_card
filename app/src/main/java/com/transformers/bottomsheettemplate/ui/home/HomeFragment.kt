package com.transformers.bottomsheettemplate.ui.home

import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.transformers.bottomsheettemplate.R
import com.transformers.bottomsheettemplate.adapter.JobsAdapter
import com.transformers.bottomsheettemplate.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeViewModel: HomeViewModel by viewModels()
        homeViewModel.jobs.observe(viewLifecycleOwner) {
            Log.d("jobs", "done")
            binding.apply {
                jobRecycleView.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = JobsAdapter(it.jobs?: listOf())
                }
            }

        }
        homeViewModel.getJobs()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
//
//    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
//        val contextMenuTextView = v as TextView
//        val context = context
//        // Add menu items via menu.add
//        menu.add(R.string.option_1)
//            .setOnMenuItemClickListener { item: MenuItem? ->
//                // Respond to item click.
//            }
//        menu.add(R.string.option_2)
//            .setOnMenuItemClickListener { item: MenuItem? ->
//                // Respond to item click.
//            }
//    }
//
//    override fun onContextMenuClosed(menu: Menu) {
//        // Respond to context menu being closed.
//    }

}