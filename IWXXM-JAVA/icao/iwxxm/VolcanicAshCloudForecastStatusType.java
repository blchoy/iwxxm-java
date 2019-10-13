//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 02:53:01 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolcanicAshCloudForecastStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VolcanicAshCloudForecastStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_PROVIDED"/&gt;
 *     &lt;enumeration value="NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="NO_VOLCANIC_ASH_EXPECTED"/&gt;
 *     &lt;enumeration value="PROVIDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VolcanicAshCloudForecastStatusType")
@XmlEnum
public enum VolcanicAshCloudForecastStatusType {


    /**
     * Information is not provided.
     * 
     */
    NOT_PROVIDED,

    /**
     * Information is not available.
     * 
     */
    NOT_AVAILABLE,

    /**
     * No volcanic ash is expected.
     * 
     */
    NO_VOLCANIC_ASH_EXPECTED,

    /**
     * Information is provided.
     * 
     */
    PROVIDED;

    public String value() {
        return name();
    }

    public static VolcanicAshCloudForecastStatusType fromValue(String v) {
        return valueOf(v);
    }

}