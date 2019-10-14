//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeteorologicalAerodromeReportStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeteorologicalAerodromeReportStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="CORRECTION"/&gt;
 *     &lt;enumeration value="MISSING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeteorologicalAerodromeReportStatusType")
@XmlEnum
public enum MeteorologicalAerodromeReportStatusType {


    /**
     * Normal report status: not a correction of an earlier report
     * 
     */
    NORMAL,

    /**
     * A correction of an earlier report
     * 
     */
    CORRECTION,

    /**
     * The report is missing ("NIL" from ICAO Annex 3 / WMO No. 49)
     * 
     */
    MISSING;

    public String value() {
        return name();
    }

    public static MeteorologicalAerodromeReportStatusType fromValue(String v) {
        return valueOf(v);
    }

}
