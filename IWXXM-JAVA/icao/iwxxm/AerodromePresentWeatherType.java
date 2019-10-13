//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ReferenceType;


/**
 * The present weather observed at, or in near vicinity of, an aerodrome.
 * 
 * Only a specific set of weather phenomenon are reported within aviation meteorology as defined in Regulation ICAO Annex 3 / WMO No. 49-2.
 * 
 * This CodeList is specifically defined for aviation purposes as defined in WMO No. 49-2. A superset of definitions are defined in WMO No. 306 Vol I.1 code-table 4678 "Significant weather phenomena".
 * 
 * <p>Java class for AerodromePresentWeatherType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromePresentWeatherType"&gt;
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
@XmlType(name = "AerodromePresentWeatherType")
public class AerodromePresentWeatherType
    extends ReferenceType
{


}
