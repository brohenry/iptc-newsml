
package gex.newsml.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A formal representation of a date and, optionally, time, expressed in ISO 8601 Basic Format, as described in the comment to the NewsMLDateTime simple type declaration above.
 * 
 * <p>Java class for DateAndTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeType", propOrder = {
    "value"
})
public class DateAndTimeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Duid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String duid;
    @XmlAttribute(name = "Euid")
    protected String euid;

    /**
     *  The date and (optionally) time at which a piece of metadata was assigned. 
     * 				Uses the format YYYYMMDDTHHMMSS{+or-}HHMM (year, month, day, time separator, hours, minutes, seconds, timezone separator, hours, minutes). If only the Date is needed, then the substring from T onwards may be omitted. Where the offset difference is +0000 the letter suffix "Z" may alternatively be used. 
     * 				This is the Basic Format defined by ISO 8601.  YYYY is a 4-digit year number. MM is a 2-digit month number. DD is a 2-digit day number. T is the letter 'T'. HH is a 2-digit hour number (using a 24-hour clock). MM is a 2 digit minute number. (Note that midnight may be represented as 240000 on the date of the day that is ending, or as 000000 on the date of the day that is beginning.) 
     * 				{+or-} is the '+' character or the '-' character, and the following HHMM are hours and minutes of offset from Universal Co-ordinated Time (UTC) as defined by ISO 8601. If the time is being expressed in UTC, then the timezone offset may be '+0000' or '-0000'. If the time is behind UTC, the timezone separator is '-'. If the time is ahead of UTC the timezone separator is '+'.
     * 				Example: 10:27 p.m. in New York on 31 December 2000 would be expressed as "20001231T222700-0500" as New York is five hours behind UTC in winter. At the same moment in London, the date and time would be expressed as "20010101T032700+0000" or as "20010101T032700-0000" because in London it is now 3:27 a.m. on 1 January 2001. At the same moment in Paris,the date and time would be expressed as "20010101T042700+0100", because Paris is one hour ahead of UTC in winter and it is now 4:27 a.m. on 1 January 2001
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the duid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuid() {
        return duid;
    }

    /**
     * Sets the value of the duid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuid(String value) {
        this.duid = value;
    }

    /**
     * Gets the value of the euid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuid() {
        return euid;
    }

    /**
     * Sets the value of the euid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuid(String value) {
        this.euid = value;
    }

}
