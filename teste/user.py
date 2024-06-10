from mainq2py import Horas

Horas()


class Cliente:
    def __init__(self, nome, saldo):
        self.nome = nome
        self.saldo = saldo
    
    def depositar(self, deposito):
        self.saldo += deposito
        print(F"Você depositou R${deposito}, seu saldo atual é de: {self.saldo}")
    
    def sacar(self, saque):
        self.saldo -= saque
        print(F"Voê sacou R${saque}, seu saldo atual é de: {self.saldo}")

Kayo = Cliente("Kayo", 2000)
Kayo.depositar(200)