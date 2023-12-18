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
               
            
            
        
              
edad= read_int ("introduce tu edad")
peso= read_float ("introduce tu peso")

activo =read_bool("introducce si es trabajador  por cuenta ajena (si/no)")
 
   