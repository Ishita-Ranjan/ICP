class Solution {
public:

    long long findHours(vector<int>& piles, int h , int banana){
        long long hours = 0;
        for(int i = 0 ; i < piles.size() ; i++){
            hours += ceil((double)piles[i] / (double)banana);
        }
        return hours;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int n = piles.size();
        int low = 1; 
        int high = *max_element(piles.begin() , piles.end()); 

        while(low <= high){
            int mid = (low + high)/2;

            if(findHours(piles , h , mid) <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
};