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
import com.example.udemypractice1.ui.theme.UdemyPractice1Theme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            UdemyPractice1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color(0xff7fffff)
                ) {
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

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            // 会社名
                            Text(
                                text = "陸丸株式会社",
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
                            Label(icon = Icons.Default.Email, text = "email")

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
                        Button(
                            modifier = Modifier.fillMaxWidth(), onClick = {},
                            //ボタンの背景色は、containerColorを使う
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xfff85f6a))
                        ) {
                            Text(text = "詳細を表示", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        // 趣味と居住地セクション
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color.LightGray.copy(alpha = 0.3f))
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                        ) {
                            Label(
                                icon = Icons.Default.Favorite,
                                text = "趣味: キックボクシング,個人開発",
                                color = Color.Gray,
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Label(
                                icon = Icons.Default.LocationOn,
                                text = "居住地: 東京都",
                                color = Color.Gray
                            )
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Label(icon: ImageVector, text: String, color: Color = MaterialTheme.colorScheme.onBackground) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = text, color = color, fontSize = 14.sp, fontWeight = FontWeight.Bold
        )
    }
}
