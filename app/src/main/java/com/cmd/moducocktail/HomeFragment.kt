package com.cmd.moducocktail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recommendedCocktailList = arrayListOf(
            Cocktails(R.drawable.somac, "소맥", 1f,2f,3f,4f,5f, "소맥소맥", "1.하이\n2.바이")
        )

        val icecreamCocktailList = arrayListOf(
            Cocktails(R.drawable.skrewbarju, "스크류바주", 5f,4f,3f,4f,5f, "맛나맛나 스크류바", "1.하이\n2.바이"),
            Cocktails(R.drawable.meronaju, "메로나주", 1.9f,1.2f,4f,2f,3f, "달콤달콤 메로나주", "1.하이\n2.바이"),
            Cocktails(R.drawable.jawsbarju, "죠스바주", 3f,3f,4f,2f,1f, "으아아 조스바", "1.하이\n2.바이")
        )

        val cokeCocktailList = arrayListOf(
            Cocktails(R.drawable.mogumoguju, "모구모구주", 5f,5f,5f,4f,2f, "모구모구모구모구", "1.하이\n2.바이"),
            Cocktails(R.drawable.bongbongju, "봉봉주", 1f,4f,3f,5f,2f, "봉보로봉봉", "1.하이\n2.바이")
        )

        rv_recommendation.layoutManager = LinearLayoutManager(activity)
        rv_coke.layoutManager = LinearLayoutManager(activity)
        rv_icecream.layoutManager = LinearLayoutManager(activity)
        rv_recommendation.setHasFixedSize(true)
        rv_coke.setHasFixedSize(true)
        rv_icecream.setHasFixedSize(true)
        rv_recommendation.isNestedScrollingEnabled = false
        rv_coke.isNestedScrollingEnabled = false
        rv_icecream.isNestedScrollingEnabled = false
        rv_recommendation.adapter = CocktailAdapter(recommendedCocktailList)
        rv_icecream.adapter = CocktailAdapter(icecreamCocktailList)
        rv_coke.adapter = CocktailAdapter(cokeCocktailList)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}