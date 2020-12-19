/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

//fungsi main
fun main() {
    //inisialisasi
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    //perintah untuk mencetak nilai dari variable
    println( """
            stringResult : $stringResult
            intResult " $intResult
        """.trimIndent())
}

// TODO 1
//fungsi generic
fun <T> getResult(args: T): Int {
    //argument atau statement
    return when (args){
        is String -> args.length //jika argumen berisi string, maka kembaliannya yaitu "Kotlin" brjumlah 6
        is Int -> args * 5 //jika argumen berisi int, maka kembaliannya yaitu 100*5 = 500
    else -> 0  //jika tidak, maka tampilkan kembaliannya tipe data int yaitu 0
    }
}