import java.util.*;

public class BoardDao {

	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		for (int i = 0; i < 3; i++) {
			Board board = new Board("제목"+i, "내용"+i);
			list.add(board);
		}
		
		
		return list;
	}
}
