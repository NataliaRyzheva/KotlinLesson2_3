val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    println("Введите сумму в рублях:")
    val amount = scan.nextInt()
    println("Введите количество ваших покупок в этом месяце:")
    val regularClient = scan.nextInt()
    val minRegularity = 5

    val result = if (amount > 1000 && amount < 10000) amount - 100
    else {
        if (amount > 10000) (amount * 0.95).toInt()
        else amount
    }
    val totalAmount = if (regularClient >= minRegularity) (result * 0.99).toInt() else result
    val totalDiscount = amount - totalAmount



    print("Сумма покупок $amount руб" + System.lineSeparator() +"ваша скидка составила $totalDiscount руб" + System.lineSeparator() + "итоговая сумма покупки с учетом скидок $totalAmount руб")
}



