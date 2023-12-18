def contar_vocales(texto):
    conteo = 0
    for vocales in texto:
        if vocales in "aeiouAEIOUáéíóúÁÉÍÓÚ":
           conteo += 1 
    return conteo            
            
    
    
resultado1 =contar_vocales("Alan")
print(f"resultado1 {resultado1}")    

resultado2 =contar_vocales("hola mundo")
print(f"resultado2 {resultado2}") 