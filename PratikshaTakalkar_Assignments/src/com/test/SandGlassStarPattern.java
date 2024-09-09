package com.test;

public class SandGlassStarPattern 
{
    public static void main(String[] args)
    {
        for(int i = 5; i > 0; i--)
        {
            // Spaces
            for(int j = 5 - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            
            // Stars
            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for(int i = 1; i <= 5; i++)
        {
            // Spaces
            for(int j = 1; j <= 5 - i; j++)
            {
                System.out.print(" ");
            }
            
            // Stars
            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
