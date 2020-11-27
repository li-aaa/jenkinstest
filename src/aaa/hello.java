package aaa;

import java.util.Arrays;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;


public class hello {
	public static void main(String[] args) {
		double b [][] = new double[5][5];
        for(int i = 0; i < b.length; i++) {
            b[i][i] = 1;  
        }
        //将数组转化为矩阵
        RealMatrix matrix = new Array2DRowRealMatrix(b);
        System.out.println("创建的数组为：\t"+matrix);
        //获取矩阵的列数 getColumnDimension() 
        System.out.println("矩阵的列数为:\t"+matrix.getColumnDimension());
        //获取矩阵的行数
        System.out.println("矩阵的行数为:\t"+matrix.getRowDimension());
        //获取矩阵的某一行,返回,仍然为矩阵
        System.out.println("矩阵的第一行为:\t"+ matrix.getRowMatrix(0));
        //获取矩阵的某一行,返回,转化为向量
        System.out.println("矩阵的第一行向量表示为:\t"+ matrix.getRowVector(1) );
        //矩阵的乘法
        double testmatrix[][] = new double[2][2];
        testmatrix[0][0] = 1;
        testmatrix[0][1] = 2;
        testmatrix[1][0] = 3;
        testmatrix[1][1] = 4;
        RealMatrix testmatrix1 = new Array2DRowRealMatrix(testmatrix);
        System.out.println("两个矩阵相乘后的结果为：\t"+testmatrix1.multiply(testmatrix1) );
        //矩阵的转置
        System.out.println("转置后的矩阵为：\t"+testmatrix1.transpose());
	}
}


