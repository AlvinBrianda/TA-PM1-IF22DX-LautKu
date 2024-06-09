import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.uti.lautku.R

class SubmitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_upload)

        // Inisialisasi tombol submit
        val submitButton: Button = findViewById(R.id.submit_button)

        // Menambahkan listener klik pada tombol submit
        submitButton.setOnClickListener {
            // Tambahkan logika untuk menangani klik tombol di sini
            // Misalnya, validasi input dan pengiriman data ke server
        }
    }
}
