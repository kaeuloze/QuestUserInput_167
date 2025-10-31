package com.example.userinput

import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable

fun FormDataDiri(modifier: Modifier
){
    //variabel variabel untuk mengingat nilai masukkan dari keyboard

    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}

    //variabel variabel untuk menyimpan data yg diperoleh dari komponen UI
    var nama by remember {mutableStateOf("")}
    var alamat by remember {mutableStateOf("")}
    var jenis by remember {mutableStateOf("")}

    var gender:List<String> = listOf("Laki-laki", "Perempuan")

    Column(modifier = Modifier.padding(top = 58.dp),
        verticalArrangement = Arrangement.Top,

        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),

            label = { Text(text = "Nama Lengkap")},

            onValueChange = {
                textNama = it
            }
        )

        Row{

            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selcetd = textJK == item,

                    onClick = { textJK = item}

                ), verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = textJK == item,

                        onClick = { textJK = item
                        })
                    Text(item)
                }
            }
        }

        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            modifier = Modifier.width(250.dp),

            label = { Text(text = "Alamat Lengkap")},

            onValueChange = {
                textNama = it
            }
        )

        divider(
            modifier = Modifier.padding(bottom = dimensionResoource(R.dimen.padding_medium), top = dimensionResource(
                id = R.dimen.padding_medium
            )),
            thickness = dimensionResources(R.dimen.divider_tipis),
            color = Color.DarkGray
        )
        Buttom(
            modifier = Modifier.fillMaxWidth(1f),
            // the button is enabled when the user makes a selection
            enabled = textAlamat.isNotEmpty(),

            onClick = {
                nama=textNama
                jenis=textJK
                alamat=textAlamat
            }
        )
    }
}