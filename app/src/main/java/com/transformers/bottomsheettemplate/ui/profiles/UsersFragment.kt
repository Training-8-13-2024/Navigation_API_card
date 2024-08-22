package com.transformers.bottomsheettemplate.ui.profiles

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.transformers.bottomsheettemplate.adapter.UserAdapter
import com.transformers.bottomsheettemplate.databinding.FragmentUsersBinding

class UsersFragment : Fragment() {

    private var _binding: FragmentUsersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private lateinit var binding: FragmentUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.e("ProfilesFragment", "onCreateView")
        binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("ProfilesFragment", "onViewCreated")

        val profilesViewModel : ProfilesViewModel by viewModels()
        profilesViewModel.profiles.observe(viewLifecycleOwner){
            Log.e("profiles", it.toString())
//binding.userRecyclerView/

            binding.apply {
//                userRV.apply {
//                    layoutManager = LinearLayoutManager(context)
//                    adapter = UserAdapter(it.profileModels?: listOf())
//                }
                txtUser.text = it.toString()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}