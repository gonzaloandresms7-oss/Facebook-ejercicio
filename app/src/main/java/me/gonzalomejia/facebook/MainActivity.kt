package me.gonzalomejia.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.gonzalomejia.facebook.ui.Screens.FacebookLoginScreen
import me.gonzalomejia.facebook.ui.Screens.FacebookRegisterScreen
import me.gonzalomejia.facebook.ui.Screens.FeedScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val myNavController= rememberNavController()
            NavHost(
                navController = myNavController,
                startDestination = "Login",
                modifier = Modifier.fillMaxSize()
            ) {
                composable(route = "Login"){
                    FacebookLoginScreen(onClickRegister = {
                        myNavController.navigate(route = "Register")
                    }, onClickIniciarSesion = {
                        myNavController.navigate(route = "Feed"){
                            popUpTo("Login"){
                                inclusive=true
                            }
                        }
                    }
                    )
                }
                composable(route = "Register"){
                    FacebookRegisterScreen(onClickBack = {
                        myNavController.popBackStack()
                    }    )
                }
                composable (route="Feed"){
                    FeedScreen()
                }
            }



        }
    }
}

