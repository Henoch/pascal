/**
 * Pascal.java    5 jul. 2021
 *
 * Copyright (c) 2021 MAR-IT Systems
 *
 * Este software es confidencial y contiene información perteneciente
 * a la MAR-IT Systems.
 *
 */

package mx.com.xpos;

/**
 * @autor MAR-IT Systems
 */
public class Pascal {

  /**
   * Método: main
   * Descripción: 
   *
   * @autor MAR-IT Systems
   * @since 5 jul. 2021
   * 
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int x = 20 ;
    int[][] m= new int[x][x];

    for (int i = 0; i < x; i++) {
      
      if(i == 0) {
        m[0][0] = 1;
      }
      
      if(i == 1) {
        m[1][0]=1;
        m[1][1]=1;
      }
      
      if( i > 1) {
        for(int j=0; j< x;j++) {
          if(j == 0) {
            m[i][j] = 1;
          }else {
            m[i][j] = m[i-1][j-1]+m[i-1][j];
          }
        }
      }
      
      
    }

    for (int i = 0; i < m.length; i++) {
      System.out.format("%"+(x-i)*2+"s","");
      for (int j = 0; j < m[i].length; j++) {
        System.out.format("%4d",m[i][j]);
        if(j == i) {
          break;
        }
      }
      System.out.println();
    }
  }

}
