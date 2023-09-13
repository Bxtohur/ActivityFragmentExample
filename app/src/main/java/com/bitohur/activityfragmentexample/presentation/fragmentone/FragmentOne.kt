package com.bitohur.activityfragmentexample.presentation.fragmentone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bitohur.activityfragmentexample.R
import com.bitohur.activityfragmentexample.databinding.FragmentOneBinding
import com.bitohur.activityfragmentexample.model.Person

class FragmentOne : Fragment() {
    private lateinit var binding : FragmentOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ):View{
        binding = FragmentOneBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigate.setOnClickListener{
            navigateToFragmentTwo()
        }
        binding.btnSendDataNavigate.setOnClickListener{
            navigateToFragmentTwo(getPerson())
        }
    }

    private fun getPerson(): Person? {
        return Person(
            name = "Tony Stark",
            job = "The Mechanic",
            profileDesc = "Genius, Billionaire, Playboy, Philantropist",
            profilePictUrl = "https://www.greenscene.co.id/wp-content/uploads/2021/05/Tony-Stark-1.jpg"
        )
    }

    private fun navigateToFragmentTwo(person: Person? = null) {
//        Bundle
//        findNavController().navigate(R.id.action_fragmentOne2_to_fragmentTwo2,Bundle().apply {
//            putParcelable(ARGS_PERSON,person)
//        })
//         safeargs
        val action = FragmentOneDirections.actionFragmentOne2ToFragmentTwo2(person)
        findNavController().navigate(action)
    }
}