package com.example.bulleye.presentation.info

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun InfoScreen(
    modifier: Modifier = Modifier,
    navController: NavController) {
   About(modifier = modifier)
}

@Composable
fun About(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier.fillMaxWidth(),

        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce neque urna, condimentum vitae arcu nec, lacinia imperdiet quam. Suspendisse condimentum, risus quis feugiat molestie, lacus mi sagittis lacus, et malesuada tortor risus non mi. Morbi nec diam sit amet nibh laoreet finibus nec nec quam. Praesent bibendum tortor in nibh elementum, et malesuada purus ullamcorper. Proin ac elit non libero egestas rhoncus eget et felis. In tristique semper pellentesque. Aliquam accumsan dolor lacinia, consequat arcu fermentum, tempus lorem. Donec dapibus congue orci ut eleifend. Vestibulum auctor dapibus felis, sit amet luctus dolor pharetra vel. Nullam a euismod leo. Proin id nisi vel dolor bibendum porttitor ac vel sem. Morbi tincidunt faucibus nisl nec laoreet. Morbi vel diam et purus consequat ultricies ut a risus. Nunc sagittis tincidunt hendrerit. Maecenas vestibulum magna at dolor fermentum, eu finibus ligula malesuada."
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    About()
}