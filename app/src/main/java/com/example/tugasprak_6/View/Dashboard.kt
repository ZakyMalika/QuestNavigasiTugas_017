package com.example.tugasprak_6.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak_6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(
//    onMasukBtnClick:()-> Unit,
    modifier: Modifier
){
  Column(modifier = Modifier
      .fillMaxWidth()
      .padding(top = 200.dp),
      horizontalAlignment = Alignment.CenterHorizontally)
  {
    Text(text = stringResource(R.string.welcome),
        fontSize = 40.sp)
//    gambar

//     identitas
      Spacer(modifier = Modifier.height(30.dp))
      Column(modifier = Modifier
          .fillMaxWidth()
          .padding(top = 200.dp),
          horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = stringResource(id = R.string.nama))
          Text(text = stringResource(id = R.string.nim))
      }


      Spacer(modifier = Modifier.height(30.dp))
      Button (
          modifier = Modifier.fillMaxWidth(1f)
              .padding(all = 25.dp),
          onClick = OnSubmitBtnClick
      ) {
          Text(stringResource(id = R.string.submit))

      }

  }





}

