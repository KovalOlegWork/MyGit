package com.example.mygit

data class Note(
    var name: String,
    var id: Int = UNDEFINED_ID
)
{
    companion object {
        const val UNDEFINED_ID = -1
    }
}