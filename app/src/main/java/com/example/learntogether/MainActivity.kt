package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnTogether(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogether( modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.bg_compose_background)

   Column( verticalArrangement = Arrangement.Center,){

    Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxWidth())



           Text(
               text = stringResource(R.string.titre),
               modifier = modifier.padding(16.dp),
               fontSize = 24.sp,
           )
       Text(
           text = stringResource(R.string.text_bloc_1),
           modifier = Modifier.padding(start = 16.dp, end = 16.dp),
           textAlign = TextAlign.Justify
       )
                   Text(
           text = stringResource(R.string.text_bloc_2),
           modifier = modifier.padding(16.dp),
           textAlign = TextAlign.Justify,
       )


   }

}

@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        LearnTogether()
    }
}