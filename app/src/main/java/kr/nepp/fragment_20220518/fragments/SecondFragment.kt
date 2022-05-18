package kr.nepp.fragment_20220518.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import kr.nepp.fragment_20220518.R

class SecondFragment : Fragment() {

//    어떤 xml을 끌어다 사용할지 결정하는 함수

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate( R.layout.fragment_second, container, false )
    }

//    동작 관련 코드 전담 함수

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToast.setOnClickListener {

            Toast.makeText(requireContext(), "프래그먼트에서 토스트", Toast.LENGTH_SHORT).show()

        }


    }


}