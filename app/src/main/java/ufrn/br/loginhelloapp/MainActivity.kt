package ufrn.br.loginhelloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextLogin:EditText = findViewById(R.id.editTextLogin)
        val editTextPassword:EditText = findViewById(R.id.editTextPassword)
        val buttonOk:Button = findViewById(R.id.buttonOk)
        val textViewErro:TextView = findViewById(R.id.textViewErro)

        buttonOk.setOnClickListener {

            val login:String = editTextLogin.text.toString()
            val password:String = editTextPassword.text.toString()

            if (login.equals("nome") && password.equals("123")){
                Toast.makeText(this, "Logado.", Toast.LENGTH_SHORT).show()
                textViewErro.text = ""
            }else{
                textViewErro.text = "Login Incorreto."
            }

        }

    }
}