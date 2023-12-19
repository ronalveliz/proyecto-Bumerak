
from funciones_disconibles import read_int, read_float, read_bool2, ver_precio, ver_1_precio, crear_precio, actualizar_precio, borrar_precio, borrar_lista_completa,salir

lista_de_precios = [1.5, 2, 3.6, 4, 5.8, 6]

while True:
   print("Escoja una opcion")
   print("1- ver todos los precios")
   print("2- ver un precio por posicion :")
   print("3- crear un nuevo precio")
   print("4- actualizar un precio existente")
   print("5- borrar un precio existente")
   print("6- borrar todos los precios")
   print("7- salir")
   
   opcion = read_int("introduce la opcion del 1 a 7: ")

   if opcion == 1:
       ver_precio(lista_de_precios)
   elif opcion == 2:
       ver_1_precio(lista_de_precios)    
   elif opcion == 3:
       crear_precio(lista_de_precios)
          
   elif opcion == 4:
       actualizar_precio(lista_de_precios)
       
   elif opcion == 5:
       borrar_precio(lista_de_precios)
       
   elif opcion == 6:
       borrar_lista_completa(lista_de_precios)
                                  
   elif opcion == 7:
       salir()
       break       
       


