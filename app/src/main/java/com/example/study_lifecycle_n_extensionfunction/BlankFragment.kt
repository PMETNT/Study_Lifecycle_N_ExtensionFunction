package com.example.study_lifecycle_n_extensionfunction

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class BlankFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("study1","프래그먼트 onCreate 확인")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("study1","프래그먼트 onCreateView 확인")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("study1","프래그먼트 onViewCreated 확인")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("study1","프래그먼트 onViewStateRestored 확인")
    }

    override fun onStart() {
        super.onStart()
        Log.d("study1","프래그먼트 onStart 확인")
    }

    override fun onResume() {
        super.onResume()
        Log.d("study1","프래그먼트 onResume 확인")
    }

    override fun onPause() {
        super.onPause()
        Log.d("study1","프래그먼트 onPause 확인")
    }

    override fun onStop() {
        super.onStop()
        Log.d("study1","프래그먼트 onStop 확인")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("study1","프래그먼트 onSaveInstanceState 확인")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("study1","프래그먼트 onDestroyView 확인")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("study1","프래그먼트 onDestroy 확인")
    }


}