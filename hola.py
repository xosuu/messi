import time



def hola():
    start = time.time()
    u = 0
    print("iniciandou...")
    for i in range(1, 10000):
        u += 1
    now = time.time() - start
    print(now)  

hola()