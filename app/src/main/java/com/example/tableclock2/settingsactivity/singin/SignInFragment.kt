package com.example.tableclock2.settingsactivity.singin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tableclock2.R
import com.example.tableclock2.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Get a reference to the binding object and inflate the fragment views.
        val binding: FragmentSignInBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_sign_in, container, false)

        return binding.root

    }

}