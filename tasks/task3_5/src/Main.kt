// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val fp = Path("test.txt")
    fp.writeText("first thing\n")
    fp.writeText("second thing\n")
    fp.appendText("third thing\n")
}
