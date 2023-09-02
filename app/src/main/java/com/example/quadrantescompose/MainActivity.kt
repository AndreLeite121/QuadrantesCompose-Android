package com.example.quadrantescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantescompose.ui.theme.QuadrantesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrants()
                }
            }
        }
    }
}
@Composable
fun ComposeQuandrat (Titulo: String, Corpo: String, modifier: Modifier){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = Titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding( bottom = 16.dp)
        )
        Text(
            text = Corpo,
            textAlign = TextAlign.Justify
        )
    }


}

@Composable
fun ComposeQuadrants(){
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row (
            Modifier.weight(1F)
        ){
            ComposeQuandrat(
                Titulo = "Text composable",
                Corpo = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp)

            )
            ComposeQuandrat(
                Titulo = "Image composable",
                Corpo = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFD0BCFF))
                    .padding(16.dp)

            )
        }
        Row (
            Modifier.weight(1F)
        ) {
            ComposeQuandrat(
                Titulo = "Row composable",
                Corpo = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFB69DF8))
                    .padding(16.dp)

            )
            ComposeQuandrat(
                Titulo = "Column composable",
                Corpo = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFF6EDFF))
                    .padding(16.dp)

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantesComposeTheme {
        ComposeQuadrants()
    }
}