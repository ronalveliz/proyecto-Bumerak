def filtrar_precios (precios,presminimo,presmaxino):
    presfinal=[]
    for precio in precios:
        if presminimo <=  precio <=  presmaxino:
            presfinal.append(precio)
            
            
    return presfinal
            
            
        
    
precios =[20.99, 42.33, 55.50, 90.77, 36.77, 47.89]

precios_filtrados = filtrar_precios(precios,40,50)

print(precios_filtrados)