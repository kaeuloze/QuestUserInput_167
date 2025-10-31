package com.example.userinput

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

        )
}