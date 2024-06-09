
package Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.uti.lautku.R
import com.uti.lautku.adapter.JournalAdapter
import com.uti.lautku.model.JournalPaper

class JournalListFragment : Fragment() {

    private lateinit var journalList: ListView
    private lateinit var journalAdapter: JournalAdapter
    private val papers = mutableListOf<JournalPaper>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_journal_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        papers.add(JournalPaper("Judul 1", "Penulis 1", "Abstrak 1"))
        papers.add(JournalPaper("Judul 2", "Penulis 2", "Abstrak 2"))

        journalList = view.findViewById(R.id.journal_list)
        journalAdapter = JournalAdapter(requireContext(), papers)
        journalList.adapter = journalAdapter

        journalList.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedPaper = papers[position]

        }
    }
}
