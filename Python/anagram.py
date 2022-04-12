def check(s1, s2):
	if(sorted(s1)==sorted(s2)):
		print("This is anagram.")

	else:
		print("This is not anagram")

s1 = input("s1= ")
s2 = input("s2= ")

check(s1, s2)
