package com.example.frame14

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class PassengerFragment : Fragment() {
    private lateinit var call : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_passenger, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        call = requireView().findViewById(R.id.call)
        call.setOnClickListener {
            val shareIntent: Intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:994556572524")
            )
            startActivity(shareIntent)
        }

        view.findViewById<Button>(R.id.request).setOnClickListener {
            Toast.makeText(requireContext(),"Hello World!",Toast.LENGTH_LONG).show()
        }


    }

}