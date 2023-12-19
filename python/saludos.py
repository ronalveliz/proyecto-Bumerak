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
                
            
        
              
