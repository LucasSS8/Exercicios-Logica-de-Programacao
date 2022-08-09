#Exercicio 8
totalele = int(input("Digite a quantidade total de eleitores:"));
brancos = int(input("Digite a quantidade de votos brancos :"));
nulos = int(input("Digite a quantidade de votos nulos :"));
validos = int(input("Digite a quantidade de votos validos :"));

perctbrancos = (100 * brancos)/totalele;
perctnulos = (100 * nulos)/totalele;
perctvalidos = (100 * validos)/totalele;

print("Total votos brancos: "+ repr(perctbrancos) +"%");
print("Total votos nulos: "+ repr(perctnulos) +"%");
print("Total votos validos: "+ repr(perctvalidos) +"%");



