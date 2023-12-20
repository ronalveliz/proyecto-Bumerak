numero = int(input("introdicce un numero + o -: "))

if numero >0:
    print("el",numero, "es positivo")
elif numero==0:
    print("el numero 0 no es +0 -")    
else:
    print("el",numero, "negativo")   
#ejercicio 4 for 
lista_de_numeros = [1,2,3,4,5,6,7,8,9,10]    
for lista in lista_de_numeros:    
    print(lista)
# ejercicio break    
    if lista <= 5:
        print(lista)
        continue
    if lista<5:
        print(lista)   
       
        break
    
    
# ejercicio 5 while
contador=1  
while contador < 11:   
    print(f"numero:{contador}")
    contador +=1

pass



    