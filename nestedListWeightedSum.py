def myFunc(input_list,depth):
    wt_sum = 0
    for item in input_list:
        if(isinstance(item, int)):
            wt_sum += item*depth
        else:
            wt_sum += myFunc(item,depth+1)
    return wt_sum

input_list = [[1,1],5,[1,2]]
result = myFunc(input_list,1)
print(result)
