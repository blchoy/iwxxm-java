//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAFReportStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TAFReportStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="AMENDMENT"/&gt;
 *     &lt;enumeration value="CANCELLATION"/&gt;
 *     &lt;enumeration value="CORRECTION"/&gt;
 *     &lt;enumeration value="MISSING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TAFReportStatusType")
@XmlEnum
public enum TAFReportStatusType {


    /**
     * An normal issuance of a TAF
     * 
     */
    NORMAL,

    /**
     * An amendment of an earlier TAF
     * 
     */
    AMENDMENT,

    /**
     * A cancellation of an earlier TAF
     * 
     */
    CANCELLATION,

    /**
     * A correction of an earlier TAF
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

    public static TAFReportStatusType fromValue(String v) {
        return valueOf(v);
    }

}