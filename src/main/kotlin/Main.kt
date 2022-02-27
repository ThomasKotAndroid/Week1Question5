fun main(args: Array<String>) {


    val Tom = mapOf("Checking" to 13266, "Savings" to 5206, "IRA" to 7448)

    netWorth(Tom)
}

    fun netWorth(Customer :Map<String, Int> ) {
        var NetWorth = 0
        for ((k, v) in Customer) {
            NetWorth += v
        }
        println(NetWorth)
    }





