public int startStation(int[] gas, int[] cost) {
        // code here
        int n = gas.length;
        int i;
        int ans;
        for(i = 0; i<n; i++) {
            if(gas[i] < cost[i]) continue;
            int j = (i+1) %n;
            ans = gas[i] - cost[i] + gas[j];
            while(j != i) {
                if(ans < cost[j]) break;
                int costj = cost[j];
                j = (j+1)%n;
                ans = ans + gas[j] - costj;
            }
            if(j == i) return i;
        }
        
        return -1;
    }
