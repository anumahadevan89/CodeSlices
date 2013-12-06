def pascaltriangle(row,colm):
    pascaltri=[]
    for i in range(1,row):
        rowele=[]
        if(i==1):
            for k in range(0,row):
                rowele.append(0)
            rowele.append(1)
            
            for k in range(0,row):
                rowele.append(0)
            pascaltri.append(rowele)
        j=1
        while j<=(1+(row*2)):
           pascaltri[i,j] = pascaltri[i-1,j-1]+pascaltri[i-1,j+1]
           j+=2
    return pascaltri[row,colm]


pascaltriangle(2,3)
