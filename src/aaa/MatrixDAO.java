package aaa;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
public interface MatrixDAO {
	RealMatrix getFromDB(int mid);
}
