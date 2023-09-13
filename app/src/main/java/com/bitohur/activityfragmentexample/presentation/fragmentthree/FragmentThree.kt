package com.bitohur.activityfragmentexample.presentation.fragmentthree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bitohur.activityfragmentexample.R
import com.bitohur.activityfragmentexample.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {
    private lateinit var binding : FragmentThreeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ):View{
        binding = FragmentThreeBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
    }
}