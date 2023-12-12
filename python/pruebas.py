#juegos de piedra papel y tijeras
import random
random.randint(0,2)
jugadas=[3]
jugadas[0] = "piedra"
jugadas[1] = "papel"
jugadas[2] = "tijera"


jugador = input("hola como te llamas: ")

print("hola", jugador, "escoge 1=piedra, 2=papel, 3=tijera")

ordenador = random.randint
if jugadas[jugador] == jugadas[ordenador]:
    print("empate")
else:
   print("hola")


