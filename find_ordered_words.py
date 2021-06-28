def foo(words, order_list):
    i = 0
  
    for word in words:
        has_mark = False
        for idx, val in enumerate(order_list[i:]):
            if word[0] == val:
                i = idx+1
                has_mark = True

        if not has_mark:
            return False
            
    return True
    
l = ['ea']
o = ['a', 'b', 'c', 'd']
print(foo(l, o));
