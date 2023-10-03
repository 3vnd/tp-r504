def puiss (a,b):
	if not type(a) is int:
		raise TypeError("Only integers are allowed")
	if not type(b) is int:
		raise TypeError("Only integers are allowed")
	if a==0 and b<0:
		raise TypeError("0 ne peut pas avoir une puissance négative")
	else:
		return a**b
