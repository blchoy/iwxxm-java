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
 * Amount of cloud - assessed by category:
 * 
 * - Sky clear (0 oktas)
 * - Few (1 - 2 oktas)
 * - Scattered (3 - 4 oktas)
 * - Broken (5 - 7 oktas)
 * - Overcast (8 oktas)
 * 
 * This CodeList is specifically defined for aviation purposes, as defined in WMO No. 49-2. A superset of cloud-amount categories are defined in WMO No. 306 Vol I.2 FM 94 BUFR code-table 0 20 008 "Cloud distribution for aviation".
 * 
 * <p>Java class for CloudAmountReportedAtAerodromeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloudAmountReportedAtAerodromeType"&gt;
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
@XmlType(name = "CloudAmountReportedAtAerodromeType")
public class CloudAmountReportedAtAerodromeType
    extends ReferenceType
{


}
