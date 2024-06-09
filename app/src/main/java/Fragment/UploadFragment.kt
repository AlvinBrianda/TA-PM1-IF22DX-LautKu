// UploadFragment.kt
package Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.uti.lautku.R

class UploadFragment : Fragment() {

    private var listener: UploadFragmentListener? = null

    private lateinit var editTextTitle: EditText
    private lateinit var editTextAuthor: EditText
    private lateinit var editTextAbstract: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_upload, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextTitle = view.findViewById(R.id.title_input)
        editTextAuthor = view.findViewById(R.id.author_input)
        editTextAbstract = view.findViewById(R.id.abstract_input)

        val buttonSubmit: Button = view.findViewById(R.id.submit_button)
        buttonSubmit.setOnClickListener {
            onSubmitButtonClick()
        }
    }

    private fun onSubmitButtonClick() {
        // Ambil data dari EditText
        val title = editTextTitle.text.toString()
        val author = editTextAuthor.text.toString()
        val abstractText = editTextAbstract.text.toString()

        // Tambahkan logika untuk menyimpan atau mengunggah data jurnal
        // Misalnya, simpan data ke database atau kirim data ke server

        // Panggil listener setelah unggah selesai
        listener?.onUploadFragmentInteraction()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is UploadFragmentListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement UploadFragmentListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface UploadFragmentListener {
        fun onUploadFragmentInteraction()
    }
}
