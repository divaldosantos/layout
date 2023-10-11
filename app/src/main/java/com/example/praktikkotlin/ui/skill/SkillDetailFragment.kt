package com.example.praktikkotlin.ui.skill

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.praktikkotlin.databinding.FragmentSkillDetailBinding

class SkillDetailFragment : Fragment(){

    private var _binding: FragmentSkillDetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        var EXTRA_NAME = "extra_name"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSkillDetailBinding.inflate(inflater, container, false)

        val activity = requireActivity()
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)

        return binding.root
    }


    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null) {
            val name = arguments?.getString(EXTRA_NAME)
            binding.textSkillDetail.text = "Ini adalah bahasa pemrograman "+name
        }
    }

}