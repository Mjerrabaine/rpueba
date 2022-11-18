import sys
import time

def main():
    linea = sys.stdin.readline()
    casos = int(linea)
    linea = sys.stdin.readline()
    palabras= []
    for i in range(0,casos):
        palabras.clear()
        enteros = linea.split()
        n=int(enteros[0])
        m=int(enteros[1])
        linea = sys.stdin.readline()
        if  m<=10^3: # n >= 1 and
            j=0
            for j in range (0,n):
                linea= linea[1:]
                listalinea=linea.split()
                palabras.extend(listalinea)
                j+1
                linea =sys.stdin.readline()
                #result= max_str(m,x,y)
                #comp.append(result)
                #print(result)
        #linea = sys.stdin.readline()
    #print(porcentaje_correcto(comp))#metodo de comparacion

#start_time=time.ti
start_time=time.time()
main()
print("--- %s tiempo segundos ---" % (time.time() - start_time))