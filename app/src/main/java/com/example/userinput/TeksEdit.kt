package com.example.userinput

import androidx.compose.ui.unit.dp

@Compasable

fun FormDataDiri(modifier: Modifier
){
    //variabel variabel untuk mengingat nilai masukkan dari keyboard

    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}

    //variabel variabel untuk menyimpan data yg diperoleh dari komponen UI
    var nama by remember {mutableSatteOf("")}
    var alamat by remember {mutableSatteOf("")}
    var jenis by remember {mutableSatteOf("")}

    var gender:List<string> = listOf("Laki-laki", "Perempuan")

    Column(modifier = Modifier.padding(top = 58.dp),
        verticalArrangement = Arrangement.Top,

        horizontalAlignment = Alignment.CenterHorizontally){
        OutLinedTextField(
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
                    selcetd = text.JK == item,

                    onClick = { text.JK = item}

                ), verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = text.JK == item,,

                        onClick = { text.JK = item
                        })
                    Text(item)
                }
            }
        }
    }
}