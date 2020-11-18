package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	private String adminName;
	private String adminID;
	private String adminPW;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[���� �̸�] : ");
		builder.append(adminName);
		builder.append(", [���� ���̵�] : ");
		builder.append(adminID);
		builder.append(", [���� ��й�ȣ] : ");
		builder.append(adminPW);
		return builder.toString();
	}
}
