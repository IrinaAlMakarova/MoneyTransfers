fun main() {
    val amount = 1000

    val amountCommission = amount * 0.0075
    val result = if (amountCommission > 35) amountCommission else 35
    print("размер комиссии $result руб.")
}


