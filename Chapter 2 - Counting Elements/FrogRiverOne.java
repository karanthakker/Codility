if (A.length == 0 || A.length == 1)
        return 0;
        

       
       boolean []B = new boolean [A.length +1];
        for (int i=0; i< A.length;i++)
        {
            if (!B[A[i]])
            
            {
                B[A[i]] = true;
            --X;
            
            }
            if (X == 0)
            return i;
        
        }
        
        return -1;