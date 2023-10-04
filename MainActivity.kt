package com.example.baitap29thang9

import android.media.Image
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.baitap29thang9.ui.theme.Baitap29thang9Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Baitap29thang9Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GiaodienInfo()
                }
            }
        }
    }
}

@Composable
fun GiaodienInfo(modifier: Modifier=Modifier){
    Column(modifier=modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        TitleGiaodienInfo()
        Image(painter = painterResource(id = R.drawable.caothang1),
            contentDescription = null,
            modifier=modifier.size(width = 300.dp, height = 300.dp)
        )
        Child()

        Iconchildent2()

            Dangky()
           Spacer(modifier = Modifier.height(30.dp))
            footer()


    }

}
@Composable
fun TitleGiaodienInfo(modifier: Modifier= Modifier){
    Box(modifier = modifier.padding(all = 12.dp)){
        Row (
            modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top){
            Column {


                Text(text = "Welcome",
                fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Vui lòng thực hiện Đăng " +
                        " Nhập hoặc Đăng Kí để sử dụng chúng tôi",
                    fontWeight = FontWeight.Bold
                )

            }
        }
    }
}
@Composable
fun Child(modifier: Modifier=Modifier){
    Box(modifier = modifier.padding(all=12.dp)){
        Row(
            modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
        Column {
            Text(text = "Đăng nhập với tài khoản " +
                    " Facebook hoặc Email",
                fontWeight = FontWeight.Bold
            )
        }
        }
    }
}
@Composable
fun Iconchild(icon:ImageVector,lable:String="",iconColor:Color= Color.Black){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon( icon,
            contentDescription = lable,
            tint=iconColor)
        Text(text=lable.uppercase())
    }
}

@Composable
fun Dangky(modifier: Modifier=Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {
        Button(onClick = { /*TODO*/},
            modifier.fillMaxWidth(),

        )
        {
            Text(
                text = "Đăng ký",
                )
        }
    }
}
@Composable
fun Iconchildent2(modifier: Modifier=Modifier){
    Row(
        modifier=modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
        Iconchild(Icons.Filled.Call)
        Spacer(modifier = Modifier.width(10.dp))
        Iconchild(Icons.Filled.Email)
    }

}
@Composable
fun footer(modifier: Modifier=Modifier){
    Row(
        modifier=modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Bottom,

    ){
        Text(text = "Bạn đã có tài khoản của ứng dụng?");
           Text(text = "Đăng nhập",
               color = Color.Blue
           )

    }
}
@Preview(showBackground = true)
@Composable
fun GiaodienInfoPreview(modifier: Modifier=Modifier){
    GiaodienInfo()
}