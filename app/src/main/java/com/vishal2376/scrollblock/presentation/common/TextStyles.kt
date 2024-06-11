package com.vishal2376.scrollblock.presentation.common

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.vishal2376.scrollblock.R
import com.vishal2376.scrollblock.ui.theme.gray


val fontMontserrat = FontFamily(Font(R.font.montserrat))
val fontPoppins = FontFamily(Font(R.font.poppins))

val titleStyle = TextStyle(
	fontSize = 30.sp,
	fontFamily = fontMontserrat,
	fontWeight = FontWeight.Bold
)

val h1style = TextStyle(
	fontSize = 24.sp,
	fontFamily = fontMontserrat,
	fontWeight = FontWeight.Bold
)

val h2style = TextStyle(
	fontSize = 20.sp,
	fontFamily = fontPoppins
)

val descriptionStyle = TextStyle(
	fontSize = 16.sp,
	fontFamily = fontPoppins,
	color = gray
)

val smallDescriptionStyle = TextStyle(
	fontSize = 14.sp,
	fontFamily = fontPoppins,
	color = gray
)
