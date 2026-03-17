class Solution(object):
    def getBiggestThree(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: List[int]
        """
        m,n= len(grid),len(grid[0])
        sums=set()
        for i in range(m):
            for j in range(n):
                sums.add(grid[i][j])
                k=1
                while i-k >=0 and i+k <m and j-k >=0 and j+k <n:
                    total=0
                    
                    r,c=i-k,j
                    while r<i and c <j+k:
                        total+=grid[r][c]
                        r+=1
                        c+=1
                    r,c=i,j+k
                    while r<i+k and c>j:
                        total+=grid[r][c]
                        r+=1
                        c-=1
                    r,c=i+k,j
                    while r>i and c>j-k:
                        total+=grid[r][c]
                        r-=1
                        c-=1
                    r,c=i,j-k
                    while r>i-k and c<j:
                        total+=grid[r][c]
                        r-=1
                        c+=1
                    sums.add(total)
                    k+=1

        return sorted(sums,reverse=True)[:3]