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
        //������ת��Ϊ����
        RealMatrix matrix = new Array2DRowRealMatrix(b);
        System.out.println("����������Ϊ��\t"+matrix);
        //��ȡ��������� getColumnDimension() 
        System.out.println("���������Ϊ:\t"+matrix.getColumnDimension());
        //��ȡ���������
        System.out.println("���������Ϊ:\t"+matrix.getRowDimension());
        //��ȡ�����ĳһ��,����,��ȻΪ����
        System.out.println("����ĵ�һ��Ϊ:\t"+ matrix.getRowMatrix(0));
        //��ȡ�����ĳһ��,����,ת��Ϊ����
        System.out.println("����ĵ�һ��������ʾΪ:\t"+ matrix.getRowVector(1) );
        //����ĳ˷�
        double testmatrix[][] = new double[2][2];
        testmatrix[0][0] = 1;
        testmatrix[0][1] = 2;
        testmatrix[1][0] = 3;
        testmatrix[1][1] = 4;
        RealMatrix testmatrix1 = new Array2DRowRealMatrix(testmatrix);
        System.out.println("����������˺�Ľ��Ϊ��\t"+testmatrix1.multiply(testmatrix1) );
        //�����ת��
        System.out.println("ת�ú�ľ���Ϊ��\t"+testmatrix1.transpose());
	}
}


