    class LeetCode_441_41 {
        public int arrangeCoins(int n) {
            int i=1;
            while(n>0){
                n-=i;
                i++;
                if(n<i){
                    return i-1;
                }

            }
            return 0;
        }
    }

