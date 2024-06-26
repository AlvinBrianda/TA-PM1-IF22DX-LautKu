package com.uti.lautku.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.uti.lautku.databinding.FragmentUploadBinding

interface UploadFragmentListener {
    fun onUploadFragmentInteraction()
}

class UploadFragment : Fragment() {

    private var _binding: FragmentUploadBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUploadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.uploadButton.setOnClickListener {
            handleUploadButtonClick()
        }
    }

    private fun handleUploadButtonClick() {
        val title = binding.uploadEditText.text.toString().trim()

        if (title.isNotEmpty()) {
            Toast.makeText(requireContext(), "Judul diunggah: $title", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "Judul tidak boleh kosong", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
