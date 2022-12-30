
class Conta(var titular:String = "") {


    var saldo:Double = 0.0
        private set

    fun deposita (valor:Double) {
        if (valor > 0) {
            this.saldo += valor
        } else {
            println("Não foi possivel realizar o deposito")
        }
    }

    fun saca (valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Valor superior ao saldo")
        }
    }

    fun transfere (valor: Double, destino:Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }


}
fun main() {

    val contaJose = Conta(titular = "José da Silva")
    val contaMaria = Conta(titular = "Maria de Fatima")

    //Depositando na conta do Jose
    realizaDeposito(contaJose)
    contaJose.deposita(valor = 1000.0)
    depoisDeposito(contaJose)
    //Depositando na conta da Maria
    realizaDeposito(contaMaria)
    contaMaria.deposita(valor = 2000.0)
    depoisDeposito(contaMaria)
    //Sacando na conta do Jose
    realizaSaque(contaJose)
    contaJose.saca(valor = 500.0)
    depoisSaque(contaJose)
    //Transferindo da conta do Jose para conta da Maria
    realizaTransfere(contaJose)
    contaJose.transfere(valor = 400.0,contaMaria)
    depoisTransferencia(contaJose)
}

fun realizaDeposito(conta: Conta) {
    println("Realizando Deposito na conta do(a) ${conta.titular}")
}

fun depoisDeposito (conta: Conta) {
    println("Deposito realizado! \nNovo Saldo:${conta.saldo}")
}

fun realizaSaque(conta: Conta) {
    println("Realizando Saque na conta do(a) ${conta.titular}")
}

fun depoisSaque(conta: Conta) {
    println("Saque realizado! \nNovo saldo: ${conta.saldo}")
}

fun realizaTransfere(conta: Conta) {
    println("Realizando Transferencia na conta do(a) ${conta.saldo}")
}

fun depoisTransferencia(conta: Conta) {
    println("Transferencia realizada! \nNovo Saldo: ${conta.saldo}")
}

