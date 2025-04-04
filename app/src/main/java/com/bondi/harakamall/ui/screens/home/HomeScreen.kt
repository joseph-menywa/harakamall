package com.bondi.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.R

@Composable
fun HomeScreen( navController: NavController){
  Column (
      modifier = Modifier.fillMaxSize()
  ) {
      Text(
          text = "HarakaMall",
          fontSize = 30.sp,
          color = Color.Blue,
          fontWeight = FontWeight.Bold,
          textAlign = TextAlign.Center,
          modifier = Modifier.fillMaxWidth(),
          fontStyle = FontStyle.Italic
      )
      Image(
          painter = painterResource(R.drawable.furniture3),
          contentDescription = "home",

      )
      Text(
          text = "Welcome to my app"
      )
      Text(
          text = "Purpose:\n" +
                  "E-commerce websites act as digital storefronts, enabling businesses to reach a wider audience and conduct transactions online.\n" +
                  "Key Features:\n" +
                  "\n" +
                  "    Product Listings: Displaying products with descriptions, images, and pricing.\n" +
                  "    Shopping Cart: Allowing users to add items to a cart for purchase.\n" +
                  "    Checkout System: Facilitating the payment process and order placement.\n" +
                  "    Payment Processing: Securely handling online payments.\n" +
                  "    Shipping and Logistics: Managing order fulfillment and delivery.\n" +
                  "    Customer Support: Providing assistance to customers throughout the purchase process.\n" +
                  "    Marketing and Promotion: Implementing strategies to attract and retain customers."
      )
      Button(
          onClick = {},
          colors = ButtonDefaults.buttonColors(Color.Blue),
          shape = RoundedCornerShape(10.dp),
          modifier = Modifier.fillMaxWidth().padding(start = 20.dp),


          )
      { Text(text = "Add to cut") }


  }}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())


}