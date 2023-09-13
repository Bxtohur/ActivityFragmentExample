package com.bitohur.activityfragmentexample.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bitohur.activityfragmentexample.R
import com.bitohur.activityfragmentexample.databinding.ActivityMainBinding
import com.bitohur.activityfragmentexample.presentation.fragmentone.FragmentOne
import com.bitohur.activityfragmentexample.presentation.fragmentthree.FragmentThree
import com.bitohur.activityfragmentexample.presentation.fragmenttwo.FragmentTwo

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}