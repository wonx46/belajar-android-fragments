package com.example.fragment.enumz;

public enum JenisActionEnum implements IEnum{
	ON_CLICK("TextView"),
	ON_CHANGE ("plain_text");

	private String name;

	private JenisActionEnum(String name)
	{
		this.name	= name;
	}

	public String getString() {
		return name;
	}

	@Override
	public String[] getItems() {

		return null;
	}
}
