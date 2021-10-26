package com.example.threeviews.presentation.two

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R
import com.example.threeviews.data.one.DummyOne
import com.example.threeviews.data.two.DummyTwo
import com.example.threeviews.domain.one.adapter.OneAdapter
import com.example.threeviews.domain.two.adapter.TwoAdapter

class TwoFragment : Fragment() {

    private lateinit var rvTwo : RecyclerView
    private lateinit var adapterTwo : TwoAdapter

      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =  inflater.inflate(R.layout.fragment_two, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvTwo = view.findViewById(R.id.rvTwo)
        adapterTwo = TwoAdapter(requireContext(), DummyTwo.getData(requireContext()))
        rvTwo.setHasFixedSize(true)
        rvTwo.layoutManager = LinearLayoutManager(requireContext())
        rvTwo.adapter = adapterTwo
    }

}