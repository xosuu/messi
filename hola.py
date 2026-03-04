import time



def hola():
    start = time.time()
    u = 0
    print("iniciandou...")
    for i in range(1, 1000000000):
        u += 1
    now = time.time() - start
    print(now)  

hola()