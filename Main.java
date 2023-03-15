public class Main {
          
    public static void main(String[] args) 
    {
        Main p = new Main();
         
        for (int i=0; i<24; i++) 
        {
          boolean result = true;
          if(i<2)
          {
              result = false;
          }
          else for(int j=2; j<=i/2; j++)
          {
              if(i%j==0)
              {
                  result = false;
                  break; 
              }
          }
           
          System.out.println("Liczba " + i + " " + (result == true ? "jest" : "nie jest") + " liczbą pierwszą");
        }
    }
}