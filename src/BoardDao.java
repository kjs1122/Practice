import java.util.*;

public class BoardDao {

	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		for (int i = 0; i < 3; i++) {
			Board board = new Board("����"+i, "����"+i);
			list.add(board);
		}
		
		
		return list;
	}
}
