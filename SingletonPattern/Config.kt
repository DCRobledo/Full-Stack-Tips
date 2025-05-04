package com.drobledo.fullstacktips.singleton

object Config {
    val APIURL: String = "https://youshouldhiredanielrobledo.com"

    fun fetchData(): String {
        return "Fetching data from $APIURL"
    }
}