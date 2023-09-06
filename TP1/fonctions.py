def puissance (a,b):
	if not type(a,b) is int:
		raise TypeError("Only integers are allowed")
	else:
		return a**b
