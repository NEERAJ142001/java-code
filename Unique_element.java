private  int unique_element(int arr[],int n)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
//same element return 0 like 1,1 return 0 or 5,2,2 return 5 only
