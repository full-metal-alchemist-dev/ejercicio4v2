package com.catuses.ejercicio4v2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.catuses.ejercicio4v2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //val db = AppDataBase.getDatabase(this)
        //var personaTest = Persona(null, "Danilo", "123", "")

//        lifecycleScope.launch(Dispatchers.IO){
//            //db.UserDAO().insertUser(user)
//            //db.PersonaDAO().selectUsers(1)
//
//            withContext(Dispatchers.Main){
//                //binding.txtUsuario.text = personaTest.username
//               // binding.txtPasword.text = personaTest.password
//            }
//
//        }

    }
}