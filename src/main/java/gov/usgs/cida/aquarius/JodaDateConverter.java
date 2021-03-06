package gov.usgs.cida.aquarius;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dmsibley
 */
public class JodaDateConverter {
	private static final Logger log = LoggerFactory.getLogger(JodaDateConverter.class);

	public static String printDate(DateTime value) {
		String result = null;
		if (null != value) {
			result = value.toString(ISODateTimeFormat.dateTime());
		}
		return result;
	}

	public static DateTime parseDate(String value) {
		DateTime result = null;
		if (null != value) {
			result = ISODateTimeFormat.dateTime().parseDateTime(value);
		}
		return result;
	}
}
