# division exacta
print(50/35)
#divicion con desemales designados
print(round(50/35,3))# indicamos 3 decimales

#division entera 

print(50//35)# pierde la parte decimal

regalos = 123
alumnos = 25

regalos_por_persona = regalos//alumnos

print(f"te toca {regalos_por_persona} regalos por persona")

# exponente (**)

print(2**3)
print(3**3)

# password  ==    ////// todos estos devuelven un boolean

password = input('Intruduce contraseña')
password_correct = 'Heroescaidos3000'
print(password==password_correct)

email = input('Intruduce tu email').lower()
email_correct ='alan@gmail.com'
print(email == email_correct)

# distinto que !=
password = input('Intruduce contraseña')
password_correct = 'Heroescaidos3000'
if password != password_correct:
     print("contraseña incorreta")
else:
    print("correcto")
    
    
# if= si

edad =int(input("Introduce tu Edad"))
if not edad >=18:
    print("no tiene acceso")
else:
    print("Acceso permitido")    
    
# in

print("java" in "curso avanzado de java con spring")
    
# in en listas

students =["angel","ricardo","juan", "pedro"]
name = input("Introduce tu nombre")
if name in students:
    print("welcome students")
else:    
    print("no pagaste el curso")
    
# not in

if name not in students:
    print("no tenes acceso")
          