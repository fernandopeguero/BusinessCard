package com.example.businesscard.information

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun Info(icon: ImageVector, contactInfo: String, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier.padding(8.dp)
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.padding(end = 16.dp)
        )

        Text(
            text = contactInfo,
            fontSize = 16.sp,
            fontWeight = FontWeight(500),
            color = Color.Black
        )
    }
}


@Composable
fun ContactInfo(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Info(icon = Icons.Filled.Call, contactInfo = stringResource(R.string.phone_number))
        Info(icon = Icons.Filled.Share, contactInfo = stringResource(R.string.dev_username))
        Info(icon = Icons.Filled.Email, contactInfo = stringResource(R.string.email_address))
    }

}

@Preview(showBackground = true)
@Composable
fun ContactInfoPreview() {
    BusinessCardTheme {
        ContactInfo(Modifier.fillMaxSize())
    }
}