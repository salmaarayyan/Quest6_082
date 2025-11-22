package com.example.quest6_082.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable

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
}