package tn.enis.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("qteValidator")
public class qteValidator implements Validator {

	public qteValidator() {}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		if (Integer.parseInt(value.toString())<0) {

			FacesMessage msg = new FacesMessage("la quqantité doit etre positive");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

		}

	}
}