import java.util.*

fun main() {
    GreetingKata()
}

class GreetingKata {

    fun greet(name: String?): String? {
        if (name.isNullOrEmpty()) {
            return "Hello, my friend."
        }
        if (isUpperCase(name)) {
            return "HELLO $name."
        }
        return "Hello $name."
    }

    private fun isUpperCase(name: String): Boolean {
        name.forEach { chr ->
            if (chr.isLowerCase()) {
                return false
            }
        }
        return true
    }

    fun greet(names: Array<String>): String? {
        if (names.isNullOrEmpty()) {
            return "Hello, my friend."
        }
        return "Hello, ${joinFriendsName(names)}."
    }

    private fun joinFriendsName(names: Array<String>): String {
        var joinNames = ""
        for (index in names.indices) {
            joinNames += if (index == names.size - 1) {
                " and ${names[index]}"
            }else{
                " ${names[index]}${if(names.size>2)"," else ""}"
            }
        }
        return joinNames.trim()
    }
}