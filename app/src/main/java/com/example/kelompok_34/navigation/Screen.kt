package com.example.kelompok_34.navigation

sealed class Screen(val route : String) {

    object Home : Screen(route = "home")
    object Result : Screen(route = "result"){
        fun passText(text: String) : String {
            return "result/$text"
        }
    }
    object Profile : Screen(route = "profile")

}