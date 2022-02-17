def getFirstNum(str):
    out = 0
    for idx in range(len(str)):
        prev = idx-1
        if str[idx].isnumeric() and (idx==0 or str[prev].isspace()):
            out = out*10 + int(str[idx])
            idx+=1;
            while(idx<len(str) and str[idx].isnumeric()):
                out = out*10 + int(str[idx])
                idx+=1
            if out!=0:
                break
    return out

print(getFirstNum("12"))
