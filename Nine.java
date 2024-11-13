public class Nine {
    public static void main(String[]args){
        int i,count=0;
        for(i=50;i<=80;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
                count++;
                if(count==3)
                {
                    break;
                }
            }
        }
    }
}
