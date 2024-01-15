package com.example.kotlintutorial

fun main(){
    var myacc : BankAccount = BankAccount("CUR5545", 34545.0)
    var myacc1 = BankAccount("SAV54565", 15.6)

    println("Ac Number : ${myacc.acnumber} and Balance : ${myacc.balance}")
    myacc.deposit(456.50)
    println("Ac Number : ${myacc.acnumber} and Balance : ${myacc.balance}")
    myacc.withdraw(43456666.0)
    println("Ac Number : ${myacc.acnumber} and Balance : ${myacc.balance}")
    myacc.displayBalance()
    myacc.currency = "USD"
    myacc.displayBalance()
    myacc1.displayBalance()
}

class BankAccount(var acnumber: String, var balance: Double, var age: Int = 0){
    var branch = "India"
    var currency = "INR"


    fun deposit(dep : Double){
        balance += dep
    }
    fun withdraw(amt : Double){
        if ( amt < balance){
            balance -= amt
        }else{
            println("Insufficient Balance")
        }
    }
    fun displayBalance(){
        println("Balance is ${this.balance} ${this.currency} for Account Number ${this.acnumber}")
    }
}

/*
class BankAccount{
    var acnumber : String = "SAV1234"
    var balance : Double = 1000.5

    constructor(num : String, bal : Double){
        this.acnumber = num
        this.balance = bal
    }

}*/