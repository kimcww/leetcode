class Solution {
public:
    int countGoodRectangles(vector<vector<int>>& rectangles) {
    int count = 0;
    int maxValue = 0;
    for (auto iter : rectangles)
    {
        int res = *min_element(iter.begin(), iter.end());
        if (maxValue == res)
            count++;
        else if (maxValue < res)
        {
            maxValue = res;
            count = 1;
        }
        else
            continue;
    }
    return count;
    }
};
