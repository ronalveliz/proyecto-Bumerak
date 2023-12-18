def sumatorio(numeros):
    sumatoriototal=0
    
    for numero in numeros:
        sumatoriototal += numero
    return sumatoriototal
    
    
resultado1= sumatorio([2, 5, 10, 10, 100])
print(resultado1)
