n = int(input())
destinations = [int(input()) for x in range(n)]

low = 100 * 1000

for i in range(n):
    total = 0
    for j, destination in enumerate(destinations):
        total += ((j - i) % n) * destination
    low = min(low, total)

print(low)
