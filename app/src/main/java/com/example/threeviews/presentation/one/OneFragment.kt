package com.example.threeviews.presentation.one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R
import com.example.threeviews.data.one.DummyOne
import com.example.threeviews.domain.one.adapter.OneAdapter

class OneFragment : Fragment(){

    private lateinit var rvOne : RecyclerView
    private lateinit var adapterOne : OneAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =  inflater.inflate(R.layout.fragment_one, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvOne = view.findViewById(R.id.rvOne)
        adapterOne = OneAdapter(requireContext(),DummyOne.getData(requireContext()))
        rvOne.setHasFixedSize(true)
        rvOne.layoutManager = LinearLayoutManager(requireContext())
        rvOne.adapter = adapterOne
    }

}