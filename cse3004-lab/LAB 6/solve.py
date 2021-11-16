import random
def solve(prices, clicks):
	clicks = sorted(clicks, reverse=True)
	prices = sorted(prices, reverse=True)
	merged = zip(clicks, prices)
	return sum(x * y for x, y in merged)
if __name__ == '__main__':
	n = int(input("Enter number of clicks: "))
	print("Provide the list of profit per click: ")
	prices = list(map(int, input().split()))
	print("Provide the number of clicks per ad: ")
	clicks = list(map(int, input().split()))
	print("\nMAximum revenue that can be genrated from the goven
	constraints is: ",end = "")
	print(solve(prices, clicks))
