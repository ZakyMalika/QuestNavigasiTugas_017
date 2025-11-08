package com.example.tugasprak_6.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.tugasprak_6.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPeserta(
    onBeranda: () -> Unit,
    onForm: () -> Unit,
    modifier: Modifier = Modifier

) {
    val allBiodata = listOf(
        listOf(
            "NAMA LENGKAP" to "Akiyama Haruto",
            "JENIS KELAMIN" to "Laki-laki",
            "STATUS PERKAWINAN" to "Belum Menikah",
            "ALAMAT" to "Shibuya, Tokyo"
        ),
        listOf(
            "NAMA LENGKAP" to "Sato Airi",
            "JENIS KELAMIN" to "Perempuan",
            "STATUS PERKAWINAN" to "Belum Menikah",
            "ALAMAT" to "Osaka, Jepang"
        ),
        listOf(
            "NAMA LENGKAP" to "Tanaka Ren",
            "JENIS KELAMIN" to "Laki-laki",
            "STATUS PERKAWINAN" to "Menikah",
            "ALAMAT" to "Yokohama, Kanagawa"
        ),
        listOf(
            "NAMA LENGKAP" to "Zaky Malika",
            "JENIS KELAMIN" to "Laki-laki",
            "STATUS PERKAWINAN" to "Belum Menikah",
            "ALAMAT" to "Kyoto, Jepang"
        ),
        listOf(
            "NAMA LENGKAP" to "Naruto",
            "JENIS KELAMIN" to "Laki-laki",
            "STATUS PERKAWINAN" to "Belum Menikah keknya",
            "ALAMAT" to "Bantul, DIY"
        )

        )
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.list))

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                itemsIndexed(allBiodata) { index, biodata ->
//                untuk biodatanya
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(color = Color.Gray)
                            .padding(20.dp)
                    ) {
                        biodata.chunked(2).forEach { rowItems ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                rowItems.forEach { (label, value) ->
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = label,
                                            style = MaterialTheme.typography.labelMedium.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = Color.Blue
                                            )
                                        )
                                        Text(
                                            text = value,
                                            style = MaterialTheme.typography.bodyMedium.copy(
                                                color = Color.Black
                                            )
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = onBeranda,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    border = BorderStroke(1.dp, Color.LightGray)
                ) { Text("Beranda", color = Color.Black) }

                Button(
                    onClick = onForm,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    border = BorderStroke(1.dp, Color.LightGray)
                ) { Text("Formulir", color = Color.Black) }
            }

        }
    }
