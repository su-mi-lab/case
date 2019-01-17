package com.sumilab

object Case {

    private const val separator = '_'

    fun toPascal(str: String): String {
        return str
            .split(separator)
            .trimEmpty()
            .convertPascal()
    }

    fun toCamel(str: String): String {
        return str
            .split(separator)
            .trimEmpty()
            .convertCamel()
    }

    fun toSnake(str: String): String {
        return str
            .trimSeparator()
            .split("")
            .trimEmpty()
            .convertSnake()

    }

    private fun List<String>.trimEmpty(): List<String> {
        return this.filter { it.isNotEmpty() }
    }

    private fun String.trimSeparator(): String {
        return this
            .run {
                mapIndexed { index, c ->
                    when {
                        index == 0 && c == separator -> ""
                        index == this.lastIndex && c == separator -> ""
                        else -> c.toString()
                    }
                }.joinToString("")
            }
    }

    private fun List<String>.convertPascal(): String {
        return joinToString("") {
            it.mapIndexed { index, word ->
                when (index) {
                    0 -> word.toUpperCase()
                    else -> word
                }
            }.joinToString("")
        }
    }

    private fun List<String>.convertCamel(): String {
        return mapIndexed { parentIndex, it ->
            it.mapIndexed { index, word ->
                when {
                    index == 0 && parentIndex == 0 -> word.toLowerCase()
                    index == 0 -> word.toUpperCase()
                    else -> word
                }
            }.joinToString("")
        }.joinToString("")
    }

    private fun List<String>.convertSnake(): String {
        return mapIndexed { parentIndex, it ->
            it.mapIndexed { index, word ->
                when {
                    index == 0 && parentIndex == 0 -> word.toLowerCase().toString()
                    word.isUpperCase() -> separator + word.toLowerCase().toString()
                    else -> word.toString()
                }
            }.joinToString("")
        }.joinToString("")

    }

}