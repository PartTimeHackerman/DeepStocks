class genArr:
    def genArr(self, origin=None, length=100, size=100):
        if origin is None:
            for i in range(length):
                origin[i] = i

        arr = []
        arr[0] = origin
        for i in range(size):
            for j in range(len(arr[0])):
                arr[i + 1][j] = i % 2 == 0 and arr[i][j] / i or 0 - arr[i + 1][j] / i
        return [1, 2, 3]
