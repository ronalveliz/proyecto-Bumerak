from saludos import read_int, read_float, read_bool2


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
       print("ha elegido ver todos los precios")
       print(lista_de_precios)
   elif opcion == 2:
       print("ha elegido ver 1 solo precios")
       posicion = read_int("Intruduce la posision del precio a consultar")
       if 0>= posicion<= len(lista_de_precios):
           print(lista_de_precios[posicion-1])
       else:
           print("posicion incorrecta")    
   elif opcion == 3:
       print("ha elegido crear un  precios")
       lista_de_precios.append(read_float("crea precio"))
       print("Se a incluido el precio a la lista_de_precios", lista_de_precios)
          
   elif opcion == 4:
       print("ha elegido actualizar un  precio")
       posicion = read_int("inserte la posicion")
       precio = read_float ("intrdusca el precio")
       lista_de_precios.insert(posicion,precio)
       print(lista_de_precios)
       
   elif opcion == 5:
       print("ha elegido borrar un  precio de la lista")
       posicion = read_int("inserte la posicion")
       del lista_de_precios[posicion]
       print(lista_de_precios)
       
   elif opcion == 6:
       print("ha elegido borrar la lista de  precios")
    
       borrar = read_bool2("desea borrar la lista de precios si / no")
       borrado_de_lista =[]
       for lista in lista_de_precios:
           if lista>0:
               borrado_de_lista.append(lista)
       for lista  in borrado_de_lista:
           lista_de_precios.remove(lista)
          
           print("se a borrado la : ",lista_de_precios)
                                  
   elif opcion == 7:
       salir =read_bool2("salir si/no")
       break       
       


