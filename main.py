import random
n = random.randint(1, 20)
cont = 1
name = raw_input("Introduzca su nombre: ")
guess = int(raw_input(name+", introduzca un numero entre 1 y 20: (Intento "+str(cont)+") "))
while n != "guess":
    print
    if guess < n:
        print "Numero muy bajo"
        cont = cont+1
        print
        guess = int(raw_input(name+", introduzca un numero entre 1 y 20: (Intento "+str(cont)+") "))
    elif guess > n:
        print "Numero muy alto"
        cont = cont+1
        print
        guess = int(raw_input(name+", introduzca un numero entre 1 y 20: (Intento "+str(cont)+") "))
    else:
        print "Enhorabuena "+name+" lo conseguiste al "+str(cont)+" intento"
        break
    if cont >= 5:
        print "Demasiados fallos "+name+", adios"
        break
    print