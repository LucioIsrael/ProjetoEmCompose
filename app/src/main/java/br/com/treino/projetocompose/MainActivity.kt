package br.com.treino.projetocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.treino.projetocompose.ui.theme.ProjetoComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "initScreen") {
                        composable("initScreen") {
                            initScreen(navController)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun initScreen(navController: NavHostController) {
    Scaffold(
        content = {
            Column() {

            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("SingUpScreen")
            })
            {
                Icon(Icons.Filled.Add, contentDescription = "")
            }
        }, topBar = {
            TopAppBar(title = { Text(text = "AppCrud") })
        })
}
