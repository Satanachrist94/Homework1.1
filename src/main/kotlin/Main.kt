fun main() {
    var amount = 50000
    val comission = 0.75
    val min_comission =  3500

    var transfer = amount * comission
    if( transfer <min_comission  )
        println("Минимальная сумма перевода 100 рублей")
    else println("Сумма перевода " +  transfer/100 +  "рублей")

}