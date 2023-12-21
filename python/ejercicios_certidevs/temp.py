def multiplicar(a,b):
    """_summary_

    Args:
        a (_type_): _description_
        b (_type_): _description_

    Returns:
        _type_: _description_
    """
    resultado = a * b
    return print(resultado)


resultado = multiplicar(5,3)
print (resultado)


def saludar(nombre = "amigo"):
    """_summary_

    Args:
        nombre (str, optional): _description_. Defaults to "amigo".
    """
    print("hola "+ nombre + " buenos dias")
    
    
saludar("ronald")

def es_par(numero):
    """_summary_

    Args:
        numero (_type_): _description_
    """
    if  numero % 2  == 0:
        print("el ",numero," es par")
    else: print("EL ", numero, " es impar ")  
      
es_par(5)    
    
    
        
    

    
     
  