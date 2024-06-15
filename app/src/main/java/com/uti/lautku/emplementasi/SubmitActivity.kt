import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.uti.lautku.R

class SubmitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_upload)

        val submitButton: Button = findViewById(R.id.uploadButton)

        submitButton.setOnClickListener {
            // Aksi yang ingin dilakukan saat tombol submit diklik
            handleSubmission()
        }
    }

    private fun handleSubmission() {
        // Contoh: Menampilkan pesan toast saat tombol submit diklik
        Toast.makeText(this, "Submit button clicked", Toast.LENGTH_SHORT).show()

    }
}