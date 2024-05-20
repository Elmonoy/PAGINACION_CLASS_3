package com.example.paginacion.screen



import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paginacion.R


@Composable
fun Main() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Content()
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround){
        Filas(img = R.drawable.phone, Descript ="#####" )
        Text(
            text = "please use the link below to verify your email and start your journey",
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,

            )

        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Yellow))  {
            Text(text = "VERIFY EMAIL",
                color= Color.Black,
                modifier = Modifier
                    .fillMaxWidth(),

                textAlign = TextAlign.Center,
                fontSize = 17.sp)


        }
        Column {
            Text(
                text = "Do you have any Question?",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth(),

                textAlign = TextAlign.Center,
                fontSize = 20.sp,

                )
            Text(
                text = "example@gmail.com",
                color = Color.Yellow,
                modifier = Modifier
                    .fillMaxWidth(),

                textAlign = TextAlign.Center,
                fontSize = 20.sp,

                )
        }



        /*
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Image_1(R.drawable.pantera)

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Texto()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Image_1(R.drawable.pantera2)

        }
    }*/
    }

}


@Composable
fun Filas(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
){
    Row(modifier=modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img), contentDescription = Descript, modifier = imgModifier
            .width(300.dp)
            .height(300.dp))

    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    Main()
}
