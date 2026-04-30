class Pattern1{

    public static void main(String[] args){

        int i ,j;
        int n=4;
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if (i==j || i+j == n+1)
                 
                {
                    System.out.print( " x ");
                }
                else
                {
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}