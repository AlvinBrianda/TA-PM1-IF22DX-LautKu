// JournalAdapter.kt
package com.uti.lautku.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.uti.lautku.R
import com.uti.lautku.model.JournalPaper

class JournalAdapter(context: Context, private val papers: List<JournalPaper>) :
    ArrayAdapter<JournalPaper>(context, 0, papers) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.journal_item, parent, false)
        }

        val currentPaper = papers[position]

        val titleTextView: TextView = itemView!!.findViewById(R.id.title)
        val authorTextView: TextView = itemView.findViewById(R.id.author)
        val abstractTextView: TextView = itemView.findViewById(R.id.abstrac)

        titleTextView.text = currentPaper.title
        authorTextView.text = currentPaper.author
        abstractTextView.text = currentPaper.abstract

        return itemView
    }
}
