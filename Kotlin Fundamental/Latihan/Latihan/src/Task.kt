/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

//inisialisasi
val valueA = 101
val valueB = 52
var valueC = 99

// fungsi main
fun main() {

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    //perintah untuk mencetak output
    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}


// fungsi calculateResult
fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO
    //statement
    val valueA = valueA
    val valueB = valueB
    val valueC = valueC

    //argument, jika nilai ValueC null, maka nilai Value C menjadi 50
    val valueCNull = if (valueC == null) {
        val ganti_valueC = 50
        ganti_valueC
    }else{
        /*
        jika valueC tidak bersifat null,
        maka valueC tetap sama berdasarkan value inisialisasi
        */

        valueC
    }
    //operator
    val result = valueA + (valueB -(valueCNull))

    //untuk mengembalikan nilai result
    return result

}


