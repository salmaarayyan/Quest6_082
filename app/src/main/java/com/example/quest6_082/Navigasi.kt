package com.example.quest6_082

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun SiswaApp(
    modifier: Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController: NavController = rememberNavController()
){
    Scaffold { isiRuang->
        val uiState = viewModel.statusUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)
        ){
            composable(route = Navigasi.Formulirku.name){
                val konteks = LocalContext.current
                FormIsian(
                    pilihanJK = JenisK.map {id -> konteks.resources.getString(id)},
                    onSubmitBtnClick = {
                        viewModel.setSiswa(it)
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData(
                    statusUiSiswa = UiState.value,
                    onBackBtnClick = { cancelAndBackToFormulirku(navController)}
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirku(
    navController: NavController
){
    navController.popBackStack(Navigasi.Formulirku.name,
        inclusive = false)
}
