from mainq1py import soma, sub, mult, div

print("Vamos somar!")

escolha=int(input("Qual operação? (1)soma (2)subtração (3)multiplicação (4)divisão: "))
while escolha < 1 and escolha > 5:
    print("número errado!")
    escolha=int(input("Qual operação? (1)soma (2)subtração (3)multiplicação (4)divisão: "))

um=int(input("Coloque um número: "))
dois=int(input("Coloque o segundo número: "))

if escolha == 1:
    soma(um, dois)
if escolha == 2:
    sub(um, dois)
if escolha == 3:
    mult(um, dois)
if escolha == 4:
    div(um, dois)
