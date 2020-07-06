package com.example.fragment.enumz;

public enum JenisWidgetEnum implements IEnum{
	TEXTVIEW("TextView"),
	PLAINTEXT ("plain_text"),
	PASSWORDTEXT ("password_text"),
	EMAILTEXT ("email_text"),
	BUTTON ("Button");

	private String name;

	private JenisWidgetEnum(String name)
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
