package com.example.tugasprak_6.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak_6.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(
    onNavigate: () -> Unit,
    modifier: Modifier = Modifier

){
    var isLoading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
  Column(modifier = Modifier
      .fillMaxWidth()
      .padding(top = 150.dp),
      horizontalAlignment = Alignment.CenterHorizontally)
  {
    Text(text = stringResource(R.string.welcome),
        fontSize = 40.sp)

      Spacer(modifier = Modifier.height(10.dp))

    Text(text = "Aplikasi Formulir Pendaftaran",
          fontSize = 25.sp)

      Spacer(modifier = Modifier.height(80.dp))
//    gambar
      val gambar1 = painterResource(id = R.drawable.logo)
      Image(
          painter = gambar1,
          contentDescription = null,
          modifier = Modifier
              .size(size = 250.dp)
              .padding(all = 1.dp)
              .clip(CircleShape)
      )

//     identitas
      Spacer(modifier = Modifier.height(80.dp))
      Column(modifier = Modifier
          .fillMaxWidth(),
//          .padding(top = 80.dp),
          horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = stringResource(id = R.string.nama))
          Text(text = stringResource(id = R.string.nim))


      }
      Spacer(modifier = Modifier.height(30.dp))


      Button(
          modifier = Modifier
              .width(250.dp)
              .padding(),
// nonaktifin tombol klo lgi loading
          enabled = !isLoading,
          onClick = {

              scope.launch {
                  isLoading = true
                  delay(3000L)
                  onNavigate()
              }
          }
      )
      {

          if (isLoading) {
              CircularProgressIndicator(
                  modifier = Modifier.size(24.dp),
                  color = MaterialTheme.colorScheme.onPrimary
              )
          } else {
              Text(text = stringResource(id = R.string.masuk),
                  Modifier
                      //.fillMaxWidth()
                      .width(200.dp),
                  textAlign = TextAlign.Center
                  //.height(30.dp)
                  //.size(100.dp)
              )
          }
      }
  }
}