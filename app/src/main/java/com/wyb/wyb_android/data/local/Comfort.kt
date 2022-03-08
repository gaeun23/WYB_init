package com.wyb.wyb_android.data.local

data class Comfort(
    var range : String,
    var comfort: String,
    var innerList : MutableList<Challenge>
)
