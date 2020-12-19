/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

//kelas Cat
class Cat(private val name: String) {
    // TODO 1
    //inisialisasi
    var sleep: Boolean = false

   //getter
    get() {
       println("Fungsi getter dipanggil")
       return field
   }
    //setter
    set(value) {
        println("Fungsi setter dipanggil")
        field = value
    }

    //fungsi toSleep
    fun toSleep() {
        //statement
        if (sleep == false){
            println("$name, let's play!")
        }else{
            println("$name, sleep!")
        }
    }
}

//fungsi main
fun main() {

    // TODO 2
    val gippy = Cat("Gippy")
    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}