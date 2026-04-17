
import json

with open("ip-ranges.json", "r") as f:

    json = json.loads(f.read()) 

print(json["syncToken"])


with open("front.txt", "w") as f:
    cont = 0
    for i in json["prefixes"]:
        cont += 1
        f.write(i["ip_prefix"]+ " ")

    f.close()
print("Total " , cont)
print("Hecho")


