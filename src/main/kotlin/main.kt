fun main () {
    var amount = 1200
    val regularСustomer = true


    if(amount >= 1000 && amount <= 10_000) {
        amount = amount - 100
    }else if (amount > 10_000){
        amount = amount - (amount / 100 * 5)
    }
    if (regularСustomer == true){
        amount = amount - (amount / 100 * 1)
    }
    println("Сумма к оплате с учетом скидки : $amount руб.")
}