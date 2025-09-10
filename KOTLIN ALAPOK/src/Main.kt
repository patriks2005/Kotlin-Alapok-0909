//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var name : String = "Patrik"
    val age : Int = 20
    val height : Double = 175.0
    var szoveg : String = "Petrik Technikum"
    println("Szöveg: $szoveg")
    val jelenlegiEv : Int = 2025
    val szulEv : Int = 2005


    fun tizEvMulva() {
        val tizEvMulva : Int
        tizEvMulva = age + 10
        println("Tíz év múlva $tizEvMulva éves lesz.")
    }

    fun eletkorKiszamit(jelenlegiEv: Int, szulEv: Int): String {
        val eletkor: Int = jelenlegiEv - szulEv
        val output: String = "Életkor: $eletkor"
        return output
    }


    fun koszontes(nev: String, eletkor: Int): String {
        println("Szia $nev, Életkor: $eletkor")

        if (eletkor > 18) {
            println("Nagykorú")
        } else if (eletkor < 18) {
            println("Kiskorú")
        } else {
            println()
        }

        return ""
    }

    fun szamitas(szam1:Int, szam2:Int) {
        var osszeg = szam1 + szam2
        var szorzat = szam1 * szam2
        println("Összeg: $osszeg \nSzorzat: $szorzat")
    }

    fun parosVagyParatlan(szam: Int): String {
        return if (szam % 2 == 0) {
            "Páros"
        } else {
            "Páratlan"
        }
    }

    fun osztalyzatJegy(osztalyzat: Int) {
        val eredmeny = when (osztalyzat) {
            in 0..49 -> "Elégtelen"
            in 50..64 -> "Elégséges"
            in 65..79 -> "Közepes"
            in 80..89 -> "Jó"
            in 90..100 -> "Jeles"
            else -> "Érvénytelen pontszám"
        }
        println(eredmeny)
    }

    fun hetNapjai(nap:Int) {
        val hetnapja = when (nap) {
            1->"Hétfő"
            2->"Kedd"
            3->"Szerda"
            4->"Csütörtök"
            5->"Péntek"
            6->"Szombat"
            7->"Vasárnap"
            else->"Érvénytelen nap"
        }
        println(hetnapja)
    }

    fun szokoevE(ev:Int) : String {
        if (ev % 4 == 0) {
            return "Szökőév"
        } else {
            return "Nem szökőév"
        }
    }

    fun ciklusok() {
        println("Egytől tízig")
        for (i in 1..10) {
            print("$i, ")
        }

        println("\nPáros számok")
        for (i in 1 .. 100) {
            if (i % 2 == 0) {
                print("$i, ")
            }
        }

        println("\nElső 10 természetes szám összege:")
        var osszeg = 0

        for (i in 1..10) {
            osszeg += i
        }
        println("Összeg: $osszeg")
    }


    fun fibonacciNumbers() {
        val n = 10   // how many Fibonacci numbers
        var a = 0
        var b = 1

        print("Fibonacci sorozat első $n eleme: ")

        for (i in 1..n) {
            print("$a ")   // print in a row
            val next = a + b
            a = b
            b = next
        }
    }

    fun whileGyakorlo() {
        var userInput = ""

        while (userInput.isNotEmpty()) {
            println(">")
            userInput = readLine()!!

            if (userInput.isNotEmpty()) {

            } else {
                return
            }
        }
    }


    fun dowhileGyakorlo() {
        var jelszo = "petrik123"
        var userInput = ""

        while (userInput.isNotEmpty() || userInput != "petrik123") {
            println("Jelszó: ")
            userInput = readLine()!!

            if (userInput == "petrik123") {
                println("Helyes jelszó.")
            } else {
                println("Helytelen jelszó.")
            }
        }
    }

    fun ketSzamOsszege(szam1:Int, szam2:Int) : Int {
        var osszeg = szam1 + szam2
        return osszeg
    }

    fun faktorialis(n: Int): Long {
        var eredmeny = 1L
        for (i in 1..n) {
            eredmeny *= i
        }
        return eredmeny
    }


    fun szovegHossz(szoveg:String):String {
        var szoveg = szoveg
        return "Szöveg hossza: ${szoveg.length}"
    }



    fun primSzam(szam:Int) {
        val number = szam
        val numbers = arrayOf(1, 3, 5, 7, 9)

        numbers.forEach { element ->
            if (element % number == 0) {
                println("Nem prím")
            } else {
                println("Prím")
            }
        }

    }


    tizEvMulva()
    println(eletkorKiszamit(jelenlegiEv, szulEv))
    println(koszontes(name, age))
    szamitas(2, 2)
    parosVagyParatlan(2)
    osztalyzatJegy(3)

    println("Írj be egy számot:")
    var nap:Int = readLine()!!.toInt()
    hetNapjai(nap)

    println("Írj be egy évet: ")
    var ev = readLine()!!.toInt()
    szokoevE(ev)

    ciklusok()


    whileGyakorlo()
    dowhileGyakorlo()
    ketSzamOsszege(1,2)

    println("Add meg az 'n' számot: ")
    var n = readLine()!!.toInt()
    faktorialis(n)

    println("Szöveg: ")
    var userText = readLine()!!.trim()
    szovegHossz(userText)


    println("Írj be egy számot: ")
    var primE :Int = readLine()!!.toInt()
    primSzam(primE)


}