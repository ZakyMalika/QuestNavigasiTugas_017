package com.example.tugasprak_6.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak_6.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPeserta(
    modifier: Modifier
){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(id = R.string.list))


    }
}