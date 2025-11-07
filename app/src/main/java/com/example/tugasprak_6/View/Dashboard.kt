package com.example.tugasprak_6.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak_6.R
import org.intellij.lang.annotations.JdkConstants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(
//    OnMasukBtnClick:()-> Unit,
    modifier: Modifier
){
  Column(modifier = Modifier
      .fillMaxWidth()
      .padding(top = 200.dp),
      horizontalAlignment = Alignment.CenterHorizontally)
  {
    Text(text = stringResource(R.string.welcome),
        fontSize = 40.sp)

      Spacer(modifier = Modifier.height(100.dp))
//    gambar
      val gambar1 = painterResource(id = R.drawable.me)
      Image(
          painter = gambar1,
          contentDescription = null,
          modifier = Modifier
              .size(size = 150.dp)
              .padding(all = 1.dp)
              .clip(CircleShape)
      )

//     identitas
      Spacer(modifier = Modifier.height(10.dp))
      Column(modifier = Modifier
          .fillMaxWidth()
          .padding(top = 100.dp),
          horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = stringResource(id = R.string.nama))
          Text(text = stringResource(id = R.string.nim))


      }
      Spacer(modifier = Modifier.height(30.dp))
//      Button (
//          modifier = Modifier.fillMaxWidth(1f)
//              .padding(),
//          onClick = OnMasukBtnClick
//      ) {
//          Text(stringResource(id = R.string.masuk))
//
//      }
      Button(
          onClick = {
              // This code block will be executed when the button is clicked
              println("Button clicked!")
              // You can also perform other actions here, like updating UI state,
              // navigating to another screen, or calling other functions.
          }
      ) {
          Text(text = stringResource(id = R.string.masuk),
              Modifier
//                  .fillMaxWidth()
                  .width(200.dp),
                      textAlign = TextAlign.Center
//                  .height(30.dp)
//                  .size(100.dp)
              )
      }




  }





}

