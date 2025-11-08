package com.example.tugasprak_6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasprak_6.View.Dashboard
import com.example.tugasprak_6.View.DaftarPeserta
import com.example.tugasprak_6.View.Pendaftaran

enum class Navigasi {
    Dashboard,
    Daftar,
    Formulir
}

@Composable
fun DataApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
        NavHost(
            navController = navController,
            startDestination = Navigasi.Dashboard.name,
            modifier = Modifier.padding()
        ) {
            composable(route = Navigasi.Dashboard.name) {
                Dashboard(
                    // tombol di Dashboard bisa langsung navigasi ke daftar
                    onNavigate = {
                        navController.navigate(Navigasi.Daftar.name)
                    }
                )
            }

            composable(route = Navigasi.Daftar.name) {
                DaftarPeserta(
                    onBeranda = {
                        navController.popBackStack(Navigasi.Dashboard.name, inclusive = false)
                    },
                    onForm = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                Pendaftaran(
                    onBeranda = {
                        cancelAndBackToDaftar(navController)
                    }
                )
            }
        }
    }


private fun cancelAndBackToDaftar(
    navController: NavHostController
) {
    navController.popBackStack(Navigasi.Daftar.name, inclusive = false)
}
