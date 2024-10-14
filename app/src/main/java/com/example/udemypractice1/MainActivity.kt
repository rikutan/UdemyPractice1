package com.example.udemypractice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.udemypractice1.ui.theme.UdemyPractice1Theme

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
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        // プロフィール画像
                        Image(
                            painter = painterResource(R.drawable.start_ruri),
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

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            // 会社名
                            Text(
                                text = "陸株式会社",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            // 部署グループ名
                            Text(
                                text = "陸丸LoveLoveカンパニー",
                                color = Color.Gray,
                                fontSize = 16.sp,
                            )
                        }
                    }
                }
            }
        }
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
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(20.dp)
            ) {
                // プロフィール画像
                Image(
                    painter = painterResource(R.drawable.start_ruri),
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

                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    // 会社名
                    Text(
                        text = "陸株式会社",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    // 部署グループ名
                    Text(
                        text = "陸丸LoveLoveカンパニー",
                        color = Color.Gray,
                        fontSize = 16.sp,
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    // Email
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "email",
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Email",
                            fontSize = 14.sp,
                            fontWeight =  FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "example@gmail.com", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    // 下線を引く
                    HorizontalDivider(
                        modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
                        thickness = 2.dp,
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                // 詳細表示ボタン
                Image(painter = , contentDescription =)
            }
        }
    }
}