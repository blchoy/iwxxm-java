//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuccessionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuccessionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="substitution"/&gt;
 *     &lt;enumeration value="division"/&gt;
 *     &lt;enumeration value="fusion"/&gt;
 *     &lt;enumeration value="initiation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuccessionType")
@XmlEnum
public enum SuccessionType {

    @XmlEnumValue("substitution")
    SUBSTITUTION("substitution"),
    @XmlEnumValue("division")
    DIVISION("division"),
    @XmlEnumValue("fusion")
    FUSION("fusion"),
    @XmlEnumValue("initiation")
    INITIATION("initiation");
    private final String value;

    SuccessionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuccessionType fromValue(String v) {
        for (SuccessionType c: SuccessionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
