//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ReferenceType;


/**
 * AerodromeForecastWeather enables the forecast weather at an aerodrome to be reported.
 * 
 * Only a specific set of weather phenomenon are reported within aviation meteorology as defined in Regulation ICAO Annex 3 / WMO No. 49-2.
 * 
 * This CodeList is specifically defined for aviation purposes as defined in WMO No. 49-2. A superset of definitions are defined in WMO No. 306 Vol I.1 code-table 4678 "Significant weather phenomena".
 * 
 * <p>Java class for AerodromeForecastWeatherType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeForecastWeatherType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}ReferenceType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeForecastWeatherType")
public class AerodromeForecastWeatherType
    extends ReferenceType
{


}
