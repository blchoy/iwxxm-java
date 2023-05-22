//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ReferenceType;


/**
 * Categorical assessment of sea surface state (or other large open body of water) based on height of waves.
 * 
 * Height in metres : Category
 * - 0 metres : Calm (glassy)
 * - 0-0.1 metres : Calm (rippled)
 * - 0.1-0.5 metres : Smooth
 * - 0.5-1.25 metres : Slight
 * - 1.25-2.5 metres : Moderate
 * - 2.5-4 metres : Rough
 * - 4-6 metres : Very rough
 * - 6-9 metres : High
 * - 9-14 metres : Very high
 * - >14 metres : Phenomenal
 * 
 * See WMO No. 306 Vol I.1 code table 3700 "State of the sea" and WMO No. 306 Vol I.2 FM 94 BUFR code table 0 22 061 "State of the sea".
 * 
 * <p>Java class for SeaSurfaceStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeaSurfaceStateType"&gt;
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
@XmlType(name = "SeaSurfaceStateType")
public class SeaSurfaceStateType
    extends ReferenceType
{


}
