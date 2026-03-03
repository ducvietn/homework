Ý tưởng thuật toán: Dùng giải thuật Euclid:    https://wiki.vnoi.info/algo/algebra/euclid

gcd(a,b) = a nếu b = 0 ; gcd(a,b) = gcd(b, a mod b)



Dùng phương pháp đệ quy:

  base case: b = 0 trả về a

  recursive case: gọi lại hàm với a = b và b = a%b

 



