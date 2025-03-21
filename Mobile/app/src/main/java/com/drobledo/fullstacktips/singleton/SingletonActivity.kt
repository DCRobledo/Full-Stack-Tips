package com.drobledo.fullstacktips.singleton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.drobledo.fullstacktips.ui.theme.FullStackTipsTheme

class SingletonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FullStackTipsTheme {
                SingletonExample()
            }
        }
    }
}

@Composable
fun SingletonExample()
{
    val response = remember { Config.fetchData() }

    Text(response)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FullStackTipsTheme {
        SingletonExample()
    }
}