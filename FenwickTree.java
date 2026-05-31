class FenwickTree {

    int[] bit;
    int size;

    FenwickTree(int n) {

        size = n;
        bit = new int[n + 1];
    }

    void update(int index, int value) {

        while(index <= size) {

            bit[index] += value;
            index += index & -index;
        }
    }

    int query(int index) {

        int sum = 0;

        while(index > 0) {

            sum += bit[index];
            index -= index & -index;
        }

        return sum;
    }
}
