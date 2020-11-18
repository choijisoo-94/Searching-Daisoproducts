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
		builder.append("[직원 이름] : ");
		builder.append(adminName);
		builder.append(", [직원 아이디] : ");
		builder.append(adminID);
		builder.append(", [직원 비밀번호] : ");
		builder.append(adminPW);
		return builder.toString();
	}
}
