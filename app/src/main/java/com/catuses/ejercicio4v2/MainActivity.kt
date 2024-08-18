package com.catuses.ejercicio4v2
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.catuses.ejercicio4v2.AppDatabases.AppDataBase
import com.catuses.ejercicio4v2.Entities.Persona
import com.catuses.ejercicio4v2.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = AppDataBase.getDatabase(this)

        binding.btnSubmit.setOnClickListener {
            val primerNombre = binding.inputPrimerNombre.text.toString()
            val segundoNombre = binding.inputSegundoNombre.text.toString()
            val primerApellido = binding.inputPrimerApellido.text.toString()
            val segundoApellido = binding.inputSegundoApellido.text.toString()
            val sexo = binding.inputSexo.text.toString()
            val telefono = binding.inputTelefono.text.toString().toIntOrNull()

            if (telefono != null) {
                val persona = Persona(
                    id = null,
                    primerNombre = primerNombre,
                    segundoNombre = segundoNombre,
                    primerApellido = primerApellido,
                    segundoApellido = segundoApellido,
                    sexo = sexo,
                    telefono = telefono
                )

                // Insert data into the database using a coroutine
                lifecycleScope.launch(Dispatchers.IO) {
                    db.PersonaDAO().insertPersona(persona)

                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@MainActivity, "Data inserted successfully", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this@MainActivity, "Please enter a valid phone number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
