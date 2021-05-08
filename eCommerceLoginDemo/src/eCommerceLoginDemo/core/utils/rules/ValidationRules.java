package eCommerceLoginDemo.core.utils.rules;

public class ValidationRules {
	public static boolean Run(boolean... logics) {
		for(boolean logic:logics) {
			if(!logic) {
				return false;
			}
		}
		return true;
	}
}
