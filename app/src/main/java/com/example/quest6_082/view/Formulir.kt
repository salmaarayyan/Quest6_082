package com.example.quest6_082.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.quest6_082.R

@Composable
fun FormIsian(
    pilihanJK: List<String>,
    OnSubmitBtnClick: (MutableList<String> -> Unit
){
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by remember { mutableStateOf("") }
    var txtGender by remember { mutableStateOf("") }
    var listData: MutableList<String> = mutableListOf(
        txtNama,
        txtGender,
        txtAlamat
    )
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(id = R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (colorResource(id = R.color.teal_700))
            ) }
    ){ isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally)

    }
}