package com.example.businesscard.information

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val backgroundImage = painterResource(id = R.drawable.pexels_pixelcop_3970396)

    Box {

        Image(
            painter = backgroundImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()

        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Profile(
                stringResource(R.string.name),
                stringResource(R.string.profession), Modifier.weight(1f)
            )
            ContactInfo(Modifier.weight(1f))
        }
    }


}



@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(Modifier.fillMaxSize())
    }
}