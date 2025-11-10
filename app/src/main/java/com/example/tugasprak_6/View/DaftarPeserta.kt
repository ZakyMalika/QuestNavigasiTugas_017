package com.example.tugasprak_6.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak_6.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPeserta(
    onBeranda: () -> Unit,
    onForm: () -> Unit,
    modifier: Modifier = Modifier

) {
    data class CardData(
        val nama: String,
        val gender: String,
        val status: String,
        val alamat: String
    )

    val allBiodata = listOf(
        CardData(
            nama = "Akiyama Haruto",
            gender = "Laki-laki",
            status = "Belum Menikah",
            alamat = "Shibuya, Tokyo"
        ),
        CardData(
            nama = "Sato Airi",
            gender = "Perempuan",
            status = "Belum Menikah",
            alamat = "Osaka, Jepang"
        ),
        CardData(
            nama = "Tanaka Ren",
            gender = "Laki-laki",
            status = "Menikah",
            alamat = "Yokohama, Kanagawa"
        ),
        CardData(
            nama = "Zaky Malika",
            gender = "Laki-laki",
            status = "Belum Menikah",
            alamat = "Kyoto, Jepang"
        ),
        CardData(
            nama = "Naruto",
            gender = "Laki-laki",
            status = "Belum Menikah keknya",
            alamat = "Bantul, DIY"
        ),
        CardData(
            nama = "Akiyama Haruto",
            gender = "Laki-laki",
            status = "Belum Menikah",
            alamat = "Shibuya, Tokyo"
        ),

        )
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            contentScale = ContentScale.Crop, // agar memenuhi layar
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.list),
                style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.Black
            ))

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {


                itemsIndexed(allBiodata) { _, data ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color.LightGray)
                            .padding(20.dp)
                            .padding(bottom = 12.dp)
                    ) {
//                      baris bertama nya
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "NAMA LENGKAP",
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                )
                                Text(
                                    text = data.nama,
                                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black)
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "JENIS KELAMIN",
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                )
                                Text(
                                    text = data.gender,
                                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black)
                                )
                            }
                        }
//                        row baris kedua
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "STATUS",
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                )
                                Text(
                                    text = data.status,
                                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black)
                                )
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "ALAMAT",
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                )
                                Text(
                                    text = data.alamat,
                                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black)
                                )
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

