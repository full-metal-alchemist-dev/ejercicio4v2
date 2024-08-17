package com.catuses.ejercicio4v2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.catuses.Ejercicio4V2.Entities.Persona
import com.catuses.ejercicio4v2.AppDatabases.AppDataBase
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