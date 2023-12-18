#modificar un elemento de la lista

precios =[5.99, 12.32, 10.00, 48.57]

print(precios[0])
print(precios[1])
print(precios[2])
print(precios[3])

precios[2] = precios[2] * 0.80

print(precios[2])


# append() agregar un elemento al final de la lista

clothes =["camisa","pantalon","abrigo","zapatos",]
print(clothes)


clothes.append("bufanda")
clothes.append("cinturon")

print(clothes)

#insert agregar un elemeto en una posicion concreta

clothes.insert(2,"Reloj Rolex flamante")
clothes.insert(0,"gallunbos de superman")
print(clothes)
