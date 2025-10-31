package com.example.userinput

@Compasable

fun FormDataDiri(modifier: Modifier
){
    //variabel variabel untuk mengingat nilai masukkan dari keyboard

    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}


}