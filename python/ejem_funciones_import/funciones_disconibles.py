def read_int(prompt):
    while True:
        try:
            numero =  int(input(prompt))
            return numero
        except Exception:
            print("No se ha podido leer el numero int")
   
def read_float(prompt):
    while True:
        try:
            numero = float(input(prompt))
            return numero
        except Exception:
            print("No se ha podido leer el numero float")
            
def read_bool(prompt):
    
            respuestausuario= (input(prompt))
            booleano = respuestausuario.lower() in ["si","yes","sí"]
            return booleano
               
def read_bool2(prompt):
    while True:
        try:
            numero = (input(prompt)).lower()
            if numero =="si":
                return True
            elif numero == "no":
                return False
            else:
                print("valor incorrecto")
        except Exception:
            print("No se ha podido leer el booleano")
                
            
        
              




def ver_precio(lista_de_precios):
    print("ha elegido ver todos los precios")
    print(lista_de_precios)

def ver_1_precio(lista_de_precios):
    print("ha elegido ver 1 solo precios")
    posicion = read_int("Intruduce la posision del precio a consultar")
    if 0>= posicion<= len(lista_de_precios):
        print(lista_de_precios[posicion-1])
    else:
        print("posicion incorrecta")

def crear_precio(lista_de_precios):
    print("ha elegido crear un  precios")
    lista_de_precios.append(read_float("crea precio"))
    print("Se a incluido el precio a la lista_de_precios", lista_de_precios)

def actualizar_precio(lista_de_precios):
    print("ha elegido actualizar un  precio")
    posicion = read_int("inserte la posicion")
    precio = read_float ("intrdusca el precio")
    lista_de_precios.insert(posicion,precio)
    print(lista_de_precios)

def borrar_precio(lista_de_precios):
    print("ha elegido borrar un  precio de la lista")
    posicion = read_int("inserte la posicion")
    del lista_de_precios[posicion]
    print(lista_de_precios)

def borrar_lista_completa(lista_de_precios):
    print("ha elegido borrar la lista de  precios")
    
    borrar = read_bool2("desea borrar la lista de precios si / no")
    borrado_de_lista =[]
    for lista in lista_de_precios:
        if lista>0:
            borrado_de_lista.append(lista)
    for lista  in borrado_de_lista:
        lista_de_precios.remove(lista)
          
        print("se a borrado la : ",lista_de_precios)

def salir():
    salir =read_bool2("salir si/no")