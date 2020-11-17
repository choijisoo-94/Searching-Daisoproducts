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

public class Product {
	private String name;
	private int amount;
	private String location;
	private int price;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[��ǰ��] : ");
		builder.append(name);
		builder.append(", [���] : ");
		builder.append(amount);
		builder.append(", [��� ��ġ] : ");
		builder.append(location);
		builder.append(", [����] : ");
		builder.append(price);
		return builder.toString();
	}
}
