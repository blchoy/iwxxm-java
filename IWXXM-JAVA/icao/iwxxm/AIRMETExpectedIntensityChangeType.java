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
 * <p>Java class for AIRMETExpectedIntensityChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AIRMETExpectedIntensityChangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_CHANGE"/&gt;
 *     &lt;enumeration value="WEAKEN"/&gt;
 *     &lt;enumeration value="INTENSIFY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AIRMETExpectedIntensityChangeType")
@XmlEnum
public enum AIRMETExpectedIntensityChangeType {


    /**
     * No change (NC)
     * 
     */
    NO_CHANGE,

    /**
     * Forecast to weaken (WKN)
     * 
     */
    WEAKEN,

    /**
     * Forecast to intensify (INTSF)
     * 
     */
    INTENSIFY;

    public String value() {
        return name();
    }

    public static AIRMETExpectedIntensityChangeType fromValue(String v) {
        return valueOf(v);
    }

}
