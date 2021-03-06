//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
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
