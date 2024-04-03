import datetime
from datetime import datetime, time
from datetime import date

class Aluno:
    def __init__(self, name):
        self.name = name
        self.ageStr = None
        self.date = None
        self.apelas = None

    def aluno(self, nome, nascimento, apelido):
        self.apelas = apelido
        self.ageStr = nascimento


    def Date(self):
        self.date = date.today()
        ano = self.date.year
        nascimento = ano - int(self.ageStr)
        print(f"Você tem: {nascimento} anos!")
        return str(self.date.year)

    def getName(self):
        return self.name

    def setName(self, name):
        self.name = name

    def saudacao(self):
        now = datetime.now()
        horas = now.hour
        ola = ""

        if horas >= 6 and horas < 12:
            ola = "Bom dia"
        elif horas >= 12 and horas < 18:
            ola = "Boa tarde"
        else:
            ola = "Boa noite"

        if self.apelas is not None:
            print(f"Oi {self.name}! {ola}, são: {horas}! Você possui apelido, que interessante: {self.apelas}!")
        else:
            print(f"Oi {self.name}! {ola}, são: {horas}!")
