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
		builder.append("[상품명] : ");
		builder.append(name);
		builder.append(", [재고] : ");
		builder.append(amount);
		builder.append(", [재고 위치] : ");
		builder.append(location);
		builder.append(", [가격] : ");
		builder.append(price);
		return builder.toString();
	}
}
