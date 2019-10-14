//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedIntensityChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpectedIntensityChangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_CHANGE"/&gt;
 *     &lt;enumeration value="WEAKEN"/&gt;
 *     &lt;enumeration value="INTENSIFY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpectedIntensityChangeType")
@XmlEnum
public enum ExpectedIntensityChangeType {


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

    public static ExpectedIntensityChangeType fromValue(String v) {
        return valueOf(v);
    }

}
