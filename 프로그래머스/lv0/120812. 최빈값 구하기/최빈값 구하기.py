def solution(array):
    temp = list(set(array))
    item = []
    itemV = []
    maxV = 0
    
    for i in temp : 
        item.append(array.count(i))
        itemV.append(i)
    
    
    if item.count(max(item)) > 1 : return -1
    
    maxV = itemV[item.index(max(item))]
    
    return maxV