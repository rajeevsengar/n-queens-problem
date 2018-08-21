public class Board{
	int max_row=0;
	int board[][];
	Board(int size){
		max_row=size;
		board=new int[max_row][max_row];
	}	
	Board(Board obj){
		this.max_row=obj.max_row;
		board=new int[max_row][max_row];
		for(int i=0;i<max_row;i++){
			for(int j=0;j<max_row;j++){
				this.board[i][j]=obj.board[i][j];
			}
		}
	}
	void printBoard(){
		for(int i=0;i<max_row;i++){
			for(int j=0;j<max_row;j++){
			System.out.print(board[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	int hasNext(int row){
		for(int i=0;i<max_row;i++)
			if(board[row][i]==0)return i;
		return -1;
	}
	void fill(int row,int col){
		board[row][col]=1;
		bottomfill(row+1,col);
		bottomleft(row+1,col-1);
		bottomright(row+1,col+1);
	}
	private void bottomfill(int row,int col){
		if(row>max_row)return;
		for(int i=row;i<max_row;i++)
			board[i][col]=2;
	}
	private void bottomleft(int row,int col){
		if(row>max_row||col<0)return;
		for(int i=row;i<max_row&&col>=0;i++,col--)
			board[i][col]=2;
	}
	private void bottomright(int row,int col){
		if(row>max_row||col>max_row)return;
		for(int i=row;i<max_row&&col<max_row;i++,col++)
			board[i][col]=2;
	}
	public static void main(String  args[]){
		Board o=new Board(4);
		o.fill(3,3);
		//o.fill(1,o.hasNext(1));
		System.out.println("next"+o.hasNext(1));
		o.printBoard();
	}
}
