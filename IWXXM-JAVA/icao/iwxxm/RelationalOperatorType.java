//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationalOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABOVE"/&gt;
 *     &lt;enumeration value="BELOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperatorType")
@XmlEnum
public enum RelationalOperatorType {


    /**
     * The actual value is above the maximum value that can be determined by the system ("ABV", "P")
     * 
     */
    ABOVE,

    /**
     * The actual value is below the minimum value that can be determined by the system ("BLW", "M")
     * 
     */
    BELOW;

    public String value() {
        return name();
    }

    public static RelationalOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
