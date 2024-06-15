package com.uti.lautku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import com.uti.lautku.adapter.JournalAdapter
import com.uti.lautku.databinding.ActivityMainBinding
import com.uti.lautku.model.JournalPaper
import com.uti.lautku.Fragment.UploadFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var journalAdapter: JournalAdapter
    private val papers = mutableListOf<JournalPaper>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        papers.add(JournalPaper("Judul 0", "Penulis 0", "Abstrak 0"))
        papers.add(JournalPaper("Judul 1", "Penulis 1", "Abstrak 1"))

        journalAdapter = JournalAdapter(this, papers)
        binding.journalList.adapter = journalAdapter

        binding.journalList.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                val selectedJournalPaper = papers[position]
                intent.putExtra("paper_title", selectedJournalPaper.title)
                startActivity(intent)
            }

        binding.uploadButton.setOnClickListener {
            onUploadButtonClick()
        }
    }

    private fun onUploadButtonClick() {
        val uploadFragment = UploadFragment()
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainerViewTag.id, uploadFragment)
            .addToBackStack(null)
            .commit()
    }

}
