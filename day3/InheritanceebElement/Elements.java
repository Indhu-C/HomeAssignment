package week2.day3.InheritanceebElement;

public class Elements extends Button{

	public static void main(String[] args) {
		WebElement superClass = new WebElement();
		
		Button subClass1 = new Button();
		TextField subClass2 = new TextField();
		Elements subClass3 = new Elements();
		
		
		CheckBoxButton childClass1 = new CheckBoxButton();
		RadioButton childClass2 = new RadioButton();
		
		superClass.click();
		superClass.setText("Super");
		
		subClass1.click();
		subClass1.setText("Button");
		subClass1.submit();
		
		subClass2.click();
		subClass2.setText("Text");
		subClass2.getText();
		
		
		childClass1.clickCheckButton();
		childClass1.setText("CheckButton");
		childClass1.click();
		
		childClass2.selectRadioButton();
		childClass2.setText("RadioButton");
		childClass2.click();
		
		subClass3.click();
		subClass3.setText("Elements");
		
	}

}
