#juegos de piedra papel y tijeras
import random
random.randint(0,2)
jugadas=["Piedra","Papel","Tijera"]
jugadas[0]
jugadas[1] 
jugadas[2] 

nombre = input("hola como te llamas: ")

print("hola", nombre, "escoge 0=piedra, 1=papel, 2=tijera")
jugador=input()
ordenador = random.randint(0,2)
if jugadas[jugador("0")] and jugadas[ordenador("1")]:
    print("empate")
else:
   print("GANASTE jugador ordenador escoge ****PAPEL****")


hora = int(input("Introduce la hora del dia: "))
if hora >=8:
     print("esta durmiendo 😒")
elif hora <= 8     

