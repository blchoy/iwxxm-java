//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MD_ObligationCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_ObligationCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mandatory"/&gt;
 *     &lt;enumeration value="optional"/&gt;
 *     &lt;enumeration value="conditional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MD_ObligationCode_Type")
@XmlEnum
public enum MDObligationCodeType {

    @XmlEnumValue("mandatory")
    MANDATORY("mandatory"),
    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("conditional")
    CONDITIONAL("conditional");
    private final String value;

    MDObligationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDObligationCodeType fromValue(String v) {
        for (MDObligationCodeType c: MDObligationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
