package usaco;

import java.util.Scanner;

/**
 *
 * @author 
 */

// Print the square of the maximum Euclidean distance 
// between any two of the points.
// https://codeforces.com/gym/102951/problem/A

// Sample input has 3 points (321, 404), (-15, 373), (-525, 990)

// Input 
// 3            
// 321 -15 -525
// 404 373 990

// Output 
// 1059112

public class maxEuclideanDist
{

  public static void main(String[] args)
  {
    //Get the input 
    Scanner in = new Scanner(System.in); 
    
    // Get  N in Line 1
    int n = in.nextInt(); 
    
    // Initialize arrays to store x and y
    int[] x = new int[n]; 
    int[] y = new int[n]; 
    
    // Get x values of the points in Line 2
    for (int i=0; i<n; i++){
      x[i] = in.nextInt(); 
    }
    
    // Get y values of the points in Line 3
    for (int i=0; i<n; i++){
      y[i] = in.nextInt(); 
    }
    
    double max_dist = 0.0f; 
    
    // Loop over all pairs of points (i,j) to find the 
    // maximum squared distance
    for(int i=0; i<n; i++)
    {
      for(int j=0; j<n; j++) 
      {
        double dx = x[i]-x[j]; 
        double dy = y[i]-y[j]; 
        double sq_dist = dx*dx + dy*dy; 
        
        // update max_dist
        if(sq_dist > max_dist)
          max_dist = sq_dist; 
      }
    }
    
    System.err.println("Max squared distance: " + max_dist);
  
  }
  
}
