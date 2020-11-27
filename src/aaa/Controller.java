package aaa;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Controller {
	public MatrixDAO mdao;
	public RealMatrix getRealMatrix(int mid) {
		RealMatrix temp;
		temp=mdao.getFromDB(mid);
		return temp;
	}
}
