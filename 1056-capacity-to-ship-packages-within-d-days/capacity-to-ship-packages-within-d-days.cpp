class Solution {
public:

    int solveDays(vector<int>& weights, int days , int mid){
        int d = 1;
        int w = 0;

        for(int i = 0 ; i < weights.size() ; i++){
            if(w + weights[i] > mid){
                d++;
                w = 0;
            }
            w += weights[i];
        }
        return d;
    }
    int shipWithinDays(vector<int>& weights, int days) {
        int n = weights.size();
        int low = *max_element(weights.begin() , weights.end());
        int high = 0;
        for(int i = 0 ; i < n ; i++){
            high += weights[i];
        }

        while(low <= high){
            int mid = (low + high)/2;

            if(solveDays(weights , days , mid) <=  days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
};