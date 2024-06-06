
fun main() {
    val discountBorder1 = 1_000
    val discount1 = 100// от покупки 1 001 скидка 100р
    val discountBorder2 = 10_000
    val discountBoughtALot = 0.05 //скидка от суммы заказа от 10_001
    val discountMusicLover = 0.01// скидка постоянного клиента

    val regularCustomers = true //постоянные покупатели
    val purchaseValue = 15_000//стоимость покупки

    var intermediateDiscount : Double = 0.0//расчитываем скидку

    if (purchaseValue > discountBorder1 && purchaseValue <= discountBorder2){
        intermediateDiscount = (purchaseValue - discount1).toDouble()
    } else if (purchaseValue > discountBorder2){
        intermediateDiscount = purchaseValue -(purchaseValue * discountBoughtALot)
        println("Покупка -  $purchaseValue руб.")
        println("После применения скидки (5%)- $intermediateDiscount руб.")
    } else {
        println("Покупка - $purchaseValue руб. Скидок нет.")
    }

    if (regularCustomers) {
        var finalDiscount = intermediateDiscount - (intermediateDiscount * discountMusicLover).toInt()
        println("Общая сумма к оплате со скидкой постоянного клиента составила - $finalDiscount руб.")
    }

}





