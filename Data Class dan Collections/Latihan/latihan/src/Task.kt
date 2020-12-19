/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

//inisialisasi
private val kelas = "Vehicle"

// fungsi main
fun main() {

    // TODO 1
    //maps
    val vehicle = mapOf(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr")


    // TODO 2
    //mengambil data dari maps
    val type = vehicle["type"]
    val maxSpeed = vehicle["maxSpeed"]
    val maxTank = vehicle["maxTank"]

    // TODO 3
    //perintah untuk mencetak output
    println(kelas)
    println("""
            Type: $type
            Maximal Speed: $maxSpeed
            Maximal Tank: $maxTank
            """.trimIndent())
}