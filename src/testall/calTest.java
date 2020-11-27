package testall;
import aaa.CAL;

import static org.junit.Assert.*;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calTest{
	private static CAL cal=new CAL();
	
	@Before
    public void setUp() {
        System.out.println("---begin test---");
    }
	@Test
	public void test1() {
		double a [][] = new double[5][5];
        for(int i = 0; i < a.length; i++) {
            a[i][i] = 1;  
        }
        //将数组转化为矩阵
        RealMatrix matrix1 = new Array2DRowRealMatrix(a);
        assertEquals(true, cal.func(matrix1));
        System.out.print(cal.func(matrix1));
        
	}
	@Test
	public void test2() {
		double a [][] = new double[5][6];
        for(int i = 0; i < a.length; i++) {
            a[i][i] = 1;  
        }
        //将数组转化为矩阵
        RealMatrix matrix1 = new Array2DRowRealMatrix(a);
        assertEquals(false, cal.func(matrix1));
        System.out.print(cal.func(matrix1));
	}
	@Test
	public void test3() {
		double a [][] = new double[2][3];
        for(int i = 0; i < a.length; i++) {
            a[i][i] = 1;  
        }
        //将数组转化为矩阵
        RealMatrix matrix1 = new Array2DRowRealMatrix(a);
        assertEquals(true, cal.func(matrix1));
        System.out.print(cal.func(matrix1));
	}
	@Test
	public void test4() {
		double a [][] = new double[6][7];
        for(int i = 0; i < a.length; i++) {
            a[i][i] = 1;  
        }
        //将数组转化为矩阵
        RealMatrix matrix1 = new Array2DRowRealMatrix(a);
        assertEquals(false, cal.func(matrix1));
        System.out.print(cal.func(matrix1));
	}
	
	@After
    public void tearDown() {
        System.out.println("---end test---");
    }
	
	
	

}
