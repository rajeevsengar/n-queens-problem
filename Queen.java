class Queen{
	int count=0;
	void queen(int row,Board obj){
		if(row==obj.max_row){
			obj.printBoard();
			count++;
			return;
		}
		int avail=obj.hasNext(row);
		Board temp2=new Board(obj);
		while(avail!=-1){
			Board temp=new Board(temp2);
			temp.fill(row,avail);
			queen(row+1,temp);
			temp2.board[row][avail]=3;
			avail=temp.hasNext(row);
		}
		return;
	}	
}