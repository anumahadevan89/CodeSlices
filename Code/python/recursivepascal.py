def pascaltri(i,j):
    if i==j | i==0:
        return 1
    return pascaltri(i-1,j-1)+pascaltri(i,j-1)


def main():
    size=raw_input("Enter the required size")
    for i in range(0,int(size)):
        for j in range(0,i):
            print(pascaltri(i,j))

if __name__ == '__main__':
    main()
