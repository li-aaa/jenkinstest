package testall;
import aaa.Controller;

import static org.mockito.Mockito.*;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


import static org.junit.Assert.*;

import org.junit.Test;
import aaa.MatrixDAO;
import aaa.CAL;
public class ControllerTest {
	@Test
	public void test1() {
		double a [][] = new double[5][5];
        for(int i = 0; i < a.length; i++) {
            a[i][i] = 1;  
        }
        RealMatrix matrix1 = new Array2DRowRealMatrix(a);
		MatrixDAO mdao=mock(MatrixDAO.class);
		when(mdao.getFromDB(0)).thenReturn(matrix1);
		Controller cl1=new Controller();
		cl1.mdao=mdao;
		RealMatrix matrix2=cl1.getRealMatrix(0);
		assertEquals(matrix1,matrix2);
		
		
	}
	@Test
	public void test2() {

		double a [][] = new double[5][5];
        for(int i = 0; i < a.length; i++) {
            a[i][i] = 1;  
        }
        RealMatrix matrix1 = new Array2DRowRealMatrix(a);
        double b [][] = new double[5][5];
        for(int i = 0; i < b.length; i++) {
            b[i][i] = 2;  
        }
        RealMatrix matrix3 = new Array2DRowRealMatrix(b);
		
		MatrixDAO mdao=mock(MatrixDAO.class);
		when(mdao.getFromDB(0)).thenReturn(matrix1);
		Controller cl1=new Controller();
		cl1.mdao=mdao;
		RealMatrix matrix2=cl1.getRealMatrix(0);
		assertEquals(matrix3,matrix2);
		
		
	}
	

}
