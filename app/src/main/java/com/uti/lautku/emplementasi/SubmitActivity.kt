import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.uti.lautku.R

class SubmitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_upload)

        val submitButton: Button = findViewById(R.id.submit_button)

        submitButton.setOnClickListener {
        }
    }
}
