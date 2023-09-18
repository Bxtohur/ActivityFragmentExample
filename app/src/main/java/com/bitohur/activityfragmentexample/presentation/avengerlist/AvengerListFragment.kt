package com.bitohur.activityfragmentexample.presentation.avengerlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitohur.activityfragmentexample.data.AvengersDataSourceImpl
import com.bitohur.activityfragmentexample.databinding.FragmentAvengerListBinding
import com.bitohur.activityfragmentexample.model.Person

class AvengerListFragment : Fragment() {
    private lateinit var binding : FragmentAvengerListBinding

    private val adapter : AvengerListAdapter by lazy {
        AvengerListAdapter{
            navigateToFragmentTwo(it)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ):View{
        binding = FragmentAvengerListBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvAvengers.adapter = adapter
        binding.rvAvengers.layoutManager = LinearLayoutManager(requireContext())
        adapter.setData(AvengersDataSourceImpl().getAvengersData())
    }

    private fun navigateToFragmentTwo(person: Person? = null) {
//        Bundle
//        findNavController().navigate(R.id.action_fragmentOne2_to_fragmentTwo2,Bundle().apply {
//            putParcelable(ARGS_PERSON,person)
//        })
//         safeargs
        val action = AvengerListFragmentDirections.navigateToDetail(person)
        findNavController().navigate(action)
    }
}