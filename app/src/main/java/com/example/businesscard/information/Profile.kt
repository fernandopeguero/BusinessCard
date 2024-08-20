package com.example.businesscard.information

import android.graphics.Color.rgb
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme


@Composable
fun Profile(name: String, profession: String, modifier: Modifier) {
    
    val logo = painterResource(id = R.drawable.cool_panda)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
    ) {
        Image(painter = logo, contentDescription = null)
        Text(
            text = name,
            fontSize = 36.sp,
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
        )

        Text(
            text = profession,
            fontSize = 20.sp,
            color = Color(rgb(127, 161, 195))
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    BusinessCardTheme {
        Profile(
            stringResource(R.string.name),
            stringResource(R.string.profession), Modifier.fillMaxSize())
    }
}