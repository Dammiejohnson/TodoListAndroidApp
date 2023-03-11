package com.catalyst.todolistapp

data class Todo (
    val title: String,
    var isChecked: Boolean = false
        )