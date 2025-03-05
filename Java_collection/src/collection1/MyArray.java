package collection1;

public class MyArray {
	int[] arr;
	
	// 정수추가 메서드
	public void add(int num) {// arr□ <-주소  100□
		if(arr==null) {
			arr=new int[1];
		}else {
			int[] temp = new int[arr.length+1];
			for(int i=0;i<arr.length;i++) {
				temp[i] = arr[i];
			}
			arr=temp;
		}
		
		
//		         ┌0번 인덱스가 내가 입력한 숫자가 저장됨
		arr[arr.length-1] = num;
	}

	
	
	// 인덱스지정하여 정수 출력 메세드
	public int get(int index) { // arr이 표현가능한 인덱스는 arr.length-1까지임
		if(arr.length-1<index) // 인덱스범위를 초과하는 경우에는 > 예외발생시키기
			throw new RuntimeException("인덱스범위초과"); // 여기서 예외발생시켰으니 MainMt에서 try catch
		return arr[index];
	}
}
