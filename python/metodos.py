texto = "hola curso java"
#calcular longuitud de txt o estructura de datos
print(len(texto))

#upper () comvierte en mayusculas

print(texto.upper())

#lower () convierte a minusculas
print(texto.lower())

#capitalize( ) convierte solo la primera letra de toda la frese
print(texto.capitalize())

#split() divide el txt en funcion de un separador *los espacios*
palabras = texto.split()
print(palabras) # muestra todos los elementos 
print(palabras[2])#saca el elemento seleccionado
print(palabras[1])
print(palabras[0])
# print(palabras[3])  error fuera de rango

# format {}{}{}
mensaje ="hola curso {} la nota minima es de {} puntos."
print (mensaje.format("Java",5))
print (mensaje.format("python",5))
print (mensaje.format("draven",5))

plantilla = "{} {} {}"
texto =plantilla.format(
    print (palabras[0].capitalize()),
    print (palabras[1].capitalize()),
    print (palabras[2].capitalize())  
)



#  f strings
elemento = "carnita"
precio = 499.99
 
print(f"el producto seleccionado es {elemento} con el precio de {precio} en euros")


#replace (x,y) reemplaza el primer valor por uno que definamos
print(texto.replace("Java","python"))
email ="@gmail.com"
print(f"deivi ronal{email}".replace(" ",""))

