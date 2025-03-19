package DTO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	
	private int boardId;
	private String writer;
	private String title;
	private String content;
	private LocalDate writeDate; //Date보다 LocalDate를 권장함
	
	
}
