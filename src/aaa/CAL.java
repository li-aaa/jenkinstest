package aaa;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class CAL {
	
	public boolean func(RealMatrix in) {//判断行列是否都小于5
		boolean flag=true;
		int cl=in.getColumnDimension();
		int ro=in.getRowDimension();
		
		if(cl>5)
			flag=false;
		if (ro<=5)
			flag=false;
		return flag;
	}
}
