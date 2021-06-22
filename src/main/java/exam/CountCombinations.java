package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    int tot;
     if (k == 0 || total == 0)
            return 0;
 
       
        if (tot[n - 1] > total)
            return knapSack(total,tot, val, n - 1);
 
        
        else
            return max(val[k - 1]
                       + knapSack(W - wt[n - 1], wt,
                                  val, n - 1),
                       knapSack(W, wt, val, n - 1));
    }
    return 0;
  }

}
