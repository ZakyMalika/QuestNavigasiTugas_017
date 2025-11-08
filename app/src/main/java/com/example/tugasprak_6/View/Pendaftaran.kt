package com.example.tugasprak_6.View

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak_6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pendaftaran(modifier: Modifier){

    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textKWN by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
        val kawin: List<String> = listOf("Menikah", "Belum Menikah", "Malas Menikah")

    var Nama by remember { mutableStateOf("") }
    var Alamat by remember { mutableStateOf("") }
    var JK by remember { mutableStateOf("") }
    var KWN by remember { mutableStateOf("") }

//    untuk dropdown
    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.judul_formulir))

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = stringResource(id = R.string.nama_lengkap),
            fontSize = 15.sp,
            color = Color.Black
        )
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier
                .width(350.dp)
                .padding(top = 30.dp, start = 30.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = { textNama = it }
        )

        Text(
            text = stringResource(id = R.string.jenis_kelamin),
            fontSize = 15.sp,
            color = Color.Black
        )
        Row {
            gender.forEach { item ->
                Row(
                    modifier = Modifier.selectable(
                        selected = textJK == item,
                        onClick = { textJK = item }
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(selected = textJK == item, onClick = { textJK = item })
                    Text(item)
                }
            }
        }

        Text(
            text = stringResource(id = R.string.status_kawin),
            fontSize = 15.sp,
            color = Color.Black
        )
//        ini buat dropdown
        Box(
            modifier = Modifier
                .padding(horizontal = 30.dp, vertical = 30.dp)
        ) {
            OutlinedTextField(
                value = KWN,
                onValueChange = { KWN = it },
                label = { Text("Pilih Status Kawin") },
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                readOnly = true,
                modifier = Modifier
                    .width(350.dp)
                    .clickable() { expanded = true },
                trailingIcon = {
                    IconButton(onClick = { expanded = !expanded }) {
                        Icon(
                            imageVector = if (expanded)
                                Icons.Default.ArrowDropDown
                            else
                                Icons.Default.ArrowDropDown,
                            contentDescription = "Dropdown icon"
                        )
                    }
                }
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.width(350.dp)
            ) {
                kawin.forEach { status ->
                    DropdownMenuItem(
                        text = { Text(status) },
                        onClick = {
                            KWN = status
                            expanded = false
                        }
                    )
                }
            }
        }


//        nih baru alamat
        Text(
            text = stringResource(id = R.string.alamat),
            fontSize = 15.sp,
            color = Color.Black
        )
        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier
                .width(350.dp)
                .padding(top = 30.dp, start = 30.dp),
            label = { Text(text = "Alamat") },
            onValueChange = { textAlamat = it }
        )
    }
}