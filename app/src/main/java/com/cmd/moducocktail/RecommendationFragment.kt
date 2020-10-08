package com.cmd.moducocktail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.fragment_recommendation.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RecommendationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecommendationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
//        val tb_spriteYes: ToggleButton = findvi

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recommendation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO : 토글버튼에 text 대신 이미지 적용
        tb_spriteYes.textOn = "O"
        tb_spriteYes.textOff = "O"
        tb_spriteNo.textOn = "X"
        tb_spriteNo.textOff = "X"
        tb_alcoholHigh.textOn = "⬆️"
        tb_alcoholHigh.textOff = "⬆️"
        tb_alcoholMid.textOn = "↔️️"
        tb_alcoholMid.textOff = "↔️️"
        tb_alcoholLow.textOn = "⬇️"
        tb_alcoholLow.textOff = "⬇️"
        tb_spriteYes.toggle()
        tb_spriteYes.toggle()
        tb_spriteNo.toggle()
        tb_spriteNo.toggle()
        tb_alcoholHigh.toggle()
        tb_alcoholHigh.toggle()
        tb_alcoholMid.toggle()
        tb_alcoholMid.toggle()
        tb_alcoholLow.toggle()
        tb_alcoholLow.toggle()
        tb_spriteYes.setOnCheckedChangeListener { _, isChecked ->
//            tb_spriteNo.toggle()
        }


    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecommendationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecommendationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}