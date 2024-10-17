package com.example.udemypractice1

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.udemypractice1.components.CompanySection
import com.example.udemypractice1.components.DetailSection
import com.example.udemypractice1.components.Label
import com.example.udemypractice1.ui.theme.UdemyPractice1Theme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            UdemyPractice1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xff7fffff)
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        // プロフィール画像
        Image(
            painter = painterResource(id = R.drawable.start_ruri),
            contentDescription = "プロフィール",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))

        // 名前
        Text(
            text = "有我陸",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(20.dp))

        // 職業
        Text(
            text = "職業: 将来成功する学生(自称)",
            color = Color.Gray,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        // 会社情報
        CompanySection()
        Spacer(modifier = Modifier.height(20.dp))

        // 詳細表示ボタン
        Button(
            modifier = Modifier.fillMaxWidth(),
            //ボタンの背景色は、containerColorを使う
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xfff85f6a)),
            onClick = {},
        ) {
            Text(text = "詳細を表示", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))

        // 趣味と居住地セクション
        DetailSection()
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    UdemyPractice1Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xff7fffff)
        ) {
            MainContent()
        }
    }
}