package com.example.businesscard.information

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme


@Composable
fun Profile(name: String, profession: String, modifier: Modifier) {
    
    val logo = painterResource(id = R.drawable.cool_panda)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = logo, contentDescription = null)
        Text(
            text = name
        )

        Text(
            text = profession
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    BusinessCardTheme {
        Profile("Fernando Peguero", "Software Engineer", Modifier.fillMaxSize())
    }
}