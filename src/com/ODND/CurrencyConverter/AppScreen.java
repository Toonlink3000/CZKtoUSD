package com.ODND.CurrencyConverter;

import net.rim.device.api.ui.*;
import net.rim.device.api.ui.component.*;
import net.rim.device.api.ui.container.*;

public class AppScreen extends net.rim.device.api.ui.container.MainScreen implements FieldChangeListener {
	
	private String[] currencies = {"USD", "CZK"};
	
	private ButtonField _convert;
	
	private ObjectChoiceField _fromCurrency;
	private ObjectChoiceField _toCurrency; 
	
	private EditField _fromAmmount;

	public AppScreen() {
		System.out.println("Changed scene");
		
		setTitle("Currency Converter");
		
		_fromCurrency = new ObjectChoiceField("From Currency", currencies);
		add(_fromCurrency);
		
		_toCurrency = new ObjectChoiceField("To Currecny", currencies);
		_toCurrency.setChangeListener(this);
		add(_toCurrency);
		
		_fromAmmount = new EditField("Ammount: ", "0", 7,Field.FIELD_HCENTER | EditField.FILTER_REAL_NUMERIC);
		add(_fromAmmount);
		
        _convert = new ButtonField("Convert", Field.FIELD_HCENTER | ButtonField.NEVER_DIRTY);
        _convert.setChangeListener(this);
        add(_convert);
		
	}

	public void fieldChanged(Field field, int context) {
		
	}

}
