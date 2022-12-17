package com.ODND.CurrencyConverter;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.Screen;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;

/**
 * A class extending the MainScreen class, which provides default standard
 * behavior for BlackBerry GUI applications.
 */
public final class WelcomeScreen extends MainScreen implements FieldChangeListener
{
	private LabelField _welcomeLabel;
	private ButtonField _continueButton;
    public WelcomeScreen()
    {        
        // Set the displayed title of the screen       
        setTitle("Currency Converter - Welcome");
        
        _welcomeLabel = new LabelField("Welcome to Currency Converter!!", Field.FIELD_HCENTER);
        add(_welcomeLabel);
        
        _continueButton = new ButtonField("Continue", Field.FIELD_HCENTER);
        _continueButton.setChangeListener(this);
        add(_continueButton);
        
    }
	public void fieldChanged(Field field, int context) {
		
		Screen screen = null;
		
		if (field == _continueButton) {
			screen = new AppScreen();
		}
		
		if (screen != null) {
			CurrencyConverter.getUiApplication().pushScreen(screen);
		}
		
		
		
	}
}
