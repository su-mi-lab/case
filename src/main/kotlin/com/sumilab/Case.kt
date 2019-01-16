package com.sumilab

object Case {

    const private val separator = '_'

    fun toPascal(str: String): String {
        var newStr = ""

        trimArray(str.split(separator)).forEach {
            it.forEachIndexed { index, word ->
                newStr += when (index) {
                    0 -> word.toUpperCase()
                    else -> word
                }
            }
        }
        return newStr
    }

    private fun trimArray(list: List<String>): List<String> {
        return list.filter { it.isNotEmpty() }
    }

}