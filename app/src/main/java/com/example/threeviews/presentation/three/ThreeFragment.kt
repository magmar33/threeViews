package com.example.threeviews.presentation.three

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R
import com.example.threeviews.data.three.DummyThree
import com.example.threeviews.data.two.DummyTwo
import com.example.threeviews.domain.three.adapter.ThreeAdapter
import com.example.threeviews.domain.two.adapter.TwoAdapter

class ThreeFragment : Fragment() {
    private lateinit var rvThree : RecyclerView
    private lateinit var adapterThree : ThreeAdapter
       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =  inflater.inflate(R.layout.fragment_three, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvThree = view.findViewById(R.id.rvThree)
        adapterThree = ThreeAdapter(requireContext(), DummyThree.getData(requireContext()))
        rvThree.setHasFixedSize(true)
        rvThree.layoutManager = LinearLayoutManager(requireContext())
        rvThree.adapter = adapterThree
    }

}